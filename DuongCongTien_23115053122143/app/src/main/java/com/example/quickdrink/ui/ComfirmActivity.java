package com.example.quickdrink.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;

import com.example.quickdrink.model.Order;
import com.example.quickdrink.model.OrderItem;

import java.util.ArrayList;

public class ComfirmActivity extends AppCompatActivity {
    private ActivityConfirmBinding b;
    private final Order order = new Order();
    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        b = ActivityConfirmBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        ArrayList<OrderItem> items = getIntent().getParcelableArrayListExtra("cart");
        int subtotal = getIntent().getIntExtra("total", 0);
        if (items!=null) order.items=items;
        order.subtotal=subtotal;
        order.coupon=null;
        order.method="PICKUP";
        refreshTotal();

        b.rvSummary.setAdapter(sumAdapter);
        new ItemTouchHelper(new ItemTouchHelper.Callback() {
        })
    }

}
