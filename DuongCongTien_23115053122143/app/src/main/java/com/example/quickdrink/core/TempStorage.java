package com.example.quickdrink.core;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.quickdrink.model.OrderItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class TempStorage {
    private static final String PREF = "qd_prefs";
    private static final String KEY_CART = "cart_json";
    private static final Gson GSON = new Gson();

    public static void saveCart(Context ctx, ArrayList<OrderItem> cart){
        SharedPreferences sp = ctx.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        sp.edit().putString(KEY_CART, GSON.toJson(cart)).apply();
    }

    public static ArrayList<OrderItem> loadCart(Context ctx){
        SharedPreferences sp = ctx.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        String json = sp.getString(KEY_CART, null);
        if (json==null) return new ArrayList<>();
        Type t=new TypeToken<ArrayList<OrderItem>>(){}.getType();
        try {
            return GSON.fromJson(json, t);
        }
        catch (Exception e){
            return new ArrayList<>();
        }
    }

    public static void clearCart(Context ctx){
        SharedPreferences sp = ctx.getSharedPreferences(PREF, Context.MODE_PRIVATE);
        sp.edit().remove(KEY_CART).apply();
    }
}
