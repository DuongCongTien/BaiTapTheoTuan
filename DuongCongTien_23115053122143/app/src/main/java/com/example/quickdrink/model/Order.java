package com.example.quickdrink.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class Order implements Parcelable {
    public ArrayList<OrderItem> items = new ArrayList<>();
    public int subtotal;
    public int vat;
    public int ship;
    public int discount;
    public int total;
    public String coupon;
    public String method;
    public String ordeId;

    public Order(){
    }
    protected Order(Parcel in) {
        items=in.createTypedArrayList(OrderItem.CREATOR);
        subtotal=in.readInt();
        vat=in.readInt();
        ship=in.readInt();
        discount=in.readInt();
        total=in.readInt();
        coupon=in.readString();
        method=in.readString();
        ordeId=in.readString();
    }

    public static final Creator<Order> CREATOR = new Creator<Order>() {
        public Order createFromParcel(Parcel in) {return new Order(in);}
        public Order[] newArray(int size) {return new Order[size];}
    };

    public int describeContents() {return 0;}
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(items);
        dest.writeInt(subtotal);
        dest.writeInt(vat);
        dest.writeInt(ship);
        dest.writeInt(discount);
        dest.writeInt(total);
        dest.writeString(coupon);
        dest.writeString(method);
        dest.writeString(ordeId);
    }
}
