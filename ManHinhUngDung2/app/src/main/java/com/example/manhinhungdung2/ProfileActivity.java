package com.example.manhinhungdung2;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    ImageButton btnSetting;
    TextView txtName, txtEmail, txtPhone, txtSkype, txtWeb;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnSetting = findViewById(R.id.btnSetting);
        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        txtSkype = findViewById(R.id.txtSkype);
        txtWeb = findViewById(R.id.txtWeb);
        avatar = findViewById(R.id.avatar);

        String user = getIntent().getStringExtra("username");
        txtName.setText(user);

//        // Thêm hiệu ứng fade-in
//        Animation fade = AnimationUtils.loadAnimation(this, R.anim.fade_in);
//        avatar.startAnimation(fade);
//        txtName.startAnimation(fade);

        btnSetting.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
            startActivity(intent);
//            overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
            finish();
        });
    }
}
