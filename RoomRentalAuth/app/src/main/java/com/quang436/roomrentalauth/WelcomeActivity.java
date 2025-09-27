package com.quang436.roomrentalauth;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class WelcomeActivity extends AppCompatActivity {

    // ★ THÊM KHAI BÁO BIẾN Ở CẤP LỚP
    private TextInputEditText edtEmail, edtPassword;
    private MaterialButton btnSignIn;
    private TextView tvCreateAccount, tvForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Nếu bạn giữ file là activity_main.xml thì đổi dòng dưới cho khớp
        setContentView(R.layout.activity_welcome);  // hoặc R.layout.activity_main

        // ★ ÁNH XẠ ID
        edtEmail       = findViewById(R.id.edtEmail);
        edtPassword    = findViewById(R.id.edtPassword);
        btnSignIn      = findViewById(R.id.btnSignIn);
        tvCreateAccount= findViewById(R.id.tvCreateAccount);
        tvForgot       = findViewById(R.id.tvForgot);

        btnSignIn.setOnClickListener(v -> {
            String email = String.valueOf(edtEmail.getText()).trim();
            String pass  = String.valueOf(edtPassword.getText()).trim();
            if (TextUtils.isEmpty(email)) { edtEmail.setError("Nhập email"); return; }
            if (TextUtils.isEmpty(pass))  { edtPassword.setError("Nhập mật khẩu"); return; }
            Toast.makeText(this, "Đăng nhập demo", Toast.LENGTH_SHORT).show();
        });

        tvCreateAccount.setOnClickListener(v ->
                startActivity(new Intent(this, CreateAccountActivity.class)));

        tvForgot.setOnClickListener(v ->
                Toast.makeText(this, "Quên mật khẩu (demo)", Toast.LENGTH_SHORT).show());
    }
}
