package com.example.viewpages;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView img = findViewById(R.id.imgDetailIcon);
        TextView tvTitle = findViewById(R.id.tvDetailTitle);
        TextView tvSubtitle = findViewById(R.id.tvDetailSubtitle);

        String title = getIntent().getStringExtra("title");
        String subtitle = getIntent().getStringExtra("subtitle");
        int iconResId = getIntent().getIntExtra("iconResId", R.drawable.ic_home);

        img.setImageResource(iconResId);
        tvTitle.setText(title);
        tvSubtitle.setText(subtitle);
    }
}
