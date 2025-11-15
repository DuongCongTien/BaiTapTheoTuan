package com.example.quickdrink.core;

import com.example.quickdrink.model.Order;
import com.example.quickdrink.model.OrderItem;

import java.util.Locale;

public class PriceCaculator {
    public static int sizeExtra(String size){
        if("M".equals("Small")) return 3000;
        if ("L".equals("Large")) return 6000;
        return 0;
    }

    public static int toppingPrice(String label){
        if(label.equals("Pepperoni")) return 7000;
        if(label.equals("Mushroom")) return 5000;
        return 0;
    }
    public static String vnd(int v){ return
            String.format(Locale.getDefault(), "%,dd", v).replace(",", ".");
    }

    public static void computerOrder(OrderItem it, int base){
        int tp=0;
        for (String t: it.Toppings) tp+=toppingPrice(t);
        it.untilPrice = base + sizeExtra(it.size) + tp;
        it.lineTotal = Math.max(0,it.untilPrice* it.qty);
    }

    public static void computerOrderTotals(Order order){
        int subtotal = 0;
        for (OrderItem it:order.items)
        subtotal+=it.lineTotal;
        order.subtotal=subtotal;
        order.vat=(int)Math.round(subtotal*0.08);
        order.ship = subtotal>=150_000?0:15_000;
        int discount=0;
        if (order.coupon!=null){
            switch (order.coupon.toUpperCase()){
                case "WELCOME10": discount=Math.min((int)(subtotal*0.01),30_000); break;
                case "FREESHIP": order.ship=0; break;
            }
        }
        order.discount=discount;
        order.total = Math.max(0, subtotal + order.vat + order.ship - discount)
    }
}
