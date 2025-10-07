package com.example.manhinhungdung2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    Button btnLogin;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);
        logo = findViewById(R.id.logo);

//        // Hiệu ứng cho logo
//        Animation bounce = AnimationUtils.loadAnimation(this, R.anim.bounce);
//        logo.startAnimation(bounce);

        btnLogin.setOnClickListener(v -> {
            String user = edtUser.getText().toString().trim();
            String pass = edtPass.getText().toString().trim();
            Log.d("LoginActivity", "Button clicked!");
            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
            intent.putExtra("username", user);
            startActivity(intent);
//            overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right);
        });
    }
}
