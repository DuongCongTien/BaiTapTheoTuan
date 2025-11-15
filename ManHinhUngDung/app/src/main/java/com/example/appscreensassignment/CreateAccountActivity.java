package com.example.appscreensassignment; // Thay bằng package của bạn

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends Activity {

    private EditText etUsername, etEmail, etPassword, etConfirmPassword;
    private Button btnSubmit, btnCancel;
    private Handler handler = new Handler();
    private int colorIndex = 0;
    private int[] colors = {0xFFFF69B4, 0xFF9370DB, 0xFFBA55D3, 0xFFFFA07A};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel = findViewById(R.id.btnCancel);

        // Animation gradient nền
        final GradientDrawable gradient = new GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                new int[]{colors[0], colors[1]}
        );
        findViewById(android.R.id.content).setBackground(gradient);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                colorIndex = (colorIndex + 1) % colors.length;
                int nextIndex = (colorIndex + 1) % colors.length;
                gradient.setColors(new int[]{colors[colorIndex], colors[nextIndex]});
                handler.postDelayed(this, 3000); // Thay đổi màu mỗi 3 giây
            }
        }, 3000);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmitClick(v);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCancelClick(v);
            }
        });
    }

    public void onSubmitClick(View view) {
        String username = etUsername.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        String confirm = etConfirmPassword.getText().toString().trim();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirm.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
        } else if (!password.equals(confirm)) {
            Toast.makeText(this, "Mật khẩu không khớp!", Toast.LENGTH_SHORT).show();
        } else if (!email.contains("@")) {
            Toast.makeText(this, "Email không hợp lệ!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tạo tài khoản thành công cho " + username + "!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void onCancelClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}