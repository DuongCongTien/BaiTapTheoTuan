package com.example.recyclerview;

public class MyData {

    public static String[] nameArray = {
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
            "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Pie"
    };

    public static String[] versionArray = {
            "1.5", "1.6", "2.0–2.1", "2.2", "2.3", "3.0–3.2",
            "4.0", "4.1–4.3", "4.4", "5.0–5.1", "6.0", "7.0–7.1", "8.0–8.1", "9.0"
    };

    public static Integer[] id_ = {
            0,1,2,3,4,5,6,7,8,9,10,11,12,13
    };

    // Icon riêng từng item: dùng drawable hệ thống để khỏi tạo file vector
    public static Integer[] drawableArray = {
            android.R.drawable.ic_menu_info_details,  // Cupcake
            android.R.drawable.ic_menu_help,          // Donut
            android.R.drawable.ic_menu_gallery,       // Eclair
            android.R.drawable.ic_menu_camera,        // Froyo
            android.R.drawable.ic_menu_call,          // Gingerbread
            android.R.drawable.ic_menu_compass,       // Honeycomb
            android.R.drawable.ic_menu_day,           // ICS
            android.R.drawable.ic_menu_directions,    // Jelly Bean
            android.R.drawable.ic_menu_agenda,        // KitKat
            android.R.drawable.ic_menu_manage,        // Lollipop
            android.R.drawable.ic_menu_mapmode,       // Marshmallow
            android.R.drawable.ic_menu_mylocation,    // Nougat
            android.R.drawable.ic_menu_myplaces,      // Oreo
            android.R.drawable.ic_menu_view           // Pie
    };
}
