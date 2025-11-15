package com.example.quickdrink.model;

public class Drink {
    public final int id;
    public final String name;
    public final int basePrice;
    public Drink(int id, String name, int basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }
}
