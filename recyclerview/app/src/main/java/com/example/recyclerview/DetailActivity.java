package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        // Toolbar có nút Back
        setSupportActionBar(ui.detailToolbar);
        ui.detailToolbar.setNavigationOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());

        String name = getIntent().getStringExtra("name");
        String version = getIntent().getStringExtra("version");
        int image = getIntent().getIntExtra("image", android.R.drawable.ic_menu_info_details);

        ui.ivLogo.setImageResource(image);
        ui.tvName.setText(name);
        ui.tvVersion.setText("Version: " + version);
    }
}
