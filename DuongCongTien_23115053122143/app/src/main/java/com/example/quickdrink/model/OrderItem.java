package com.example.quickdrink.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class OrderItem implements Parcelable {
    public int  drinkId;
    public String Name;
    public String size;

    public ArrayList<String> Toppings = new ArrayList<>();
    public int untilPrice;
    public int qty;
    public int lineTotal;
    public OrderItem() {}
    protected OrderItem(Parcel in) {
        drinkId=in.readInt();
        Name=in.readString();
        size=in.readString();
        Toppings=in.createStringArrayList();
        untilPrice=in.readInt();
        qty=in.readInt();
        lineTotal=in.readInt();
    }
    public static final Creator<OrderItem> CREATOR = new Creator<OrderItem>() {
        public OrderItem createFromParcel(Parcel in) {return new OrderItem(in);}
        public OrderItem[] newArray(int size) {return new OrderItem[size];}
    };
    public int describeContents() {return 0;}
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(drinkId);
        dest.writeString(Name);
        dest.writeString(size);
        dest.writeStringList(Toppings);
        dest.writeInt(untilPrice);
        dest.writeInt(qty);
        dest.writeInt(lineTotal);
    }
}
