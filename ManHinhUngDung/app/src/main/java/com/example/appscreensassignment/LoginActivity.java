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

public class LoginActivity extends Activity {

    private EditText etUsername, etPassword;
    private Button btnLogin, btnCreateAccount;
    private Handler handler = new Handler();
    private int colorIndex = 0;
    private int[] colors = {0xFFFF69B4, 0xFF9370DB, 0xFFBA55D3, 0xFFFFA07A};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnCreateAccount = findViewById(R.id.btnCreateAccount);

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

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginClick(v);
            }
        });

        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCreateAccountClick(v);
            }
        });
    }

    public void onLoginClick(View view) {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ Username và Password!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Đăng nhập thành công với " + username + "!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onCreateAccountClick(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
}