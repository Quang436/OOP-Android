package com.quang436.roomrentalauth;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class CreateAccountActivity extends AppCompatActivity {

    // ★ THÊM KHAI BÁO BIẾN Ở CẤP LỚP
    private TextInputEditText edtFirstName, edtLastName, edtEmail, edtPassword;
    private MaterialButton btnCreate;
    private TextView tvBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_account);

        // ★ ÁNH XẠ ID
        edtFirstName   = findViewById(R.id.edtFirstName);
        edtLastName    = findViewById(R.id.edtLastName);
        edtEmail       = findViewById(R.id.edtEmail);
        edtPassword    = findViewById(R.id.edtPassword);
        btnCreate      = findViewById(R.id.btnCreate);
        tvBackToLogin  = findViewById(R.id.tvBackToLogin);

        btnCreate.setOnClickListener(v -> {
            if (isInvalid()) return;
            Toast.makeText(this, "Tạo tài khoản demo", Toast.LENGTH_SHORT).show();
            finish();
        });

        tvBackToLogin.setOnClickListener(v -> finish());
    }

    private boolean isInvalid() {
        if (TextUtils.isEmpty(edtFirstName.getText())) { edtFirstName.setError("Nhập họ"); return true; }
        if (TextUtils.isEmpty(edtLastName.getText()))  { edtLastName.setError("Nhập tên"); return true; }
        if (TextUtils.isEmpty(edtEmail.getText()))     { edtEmail.setError("Nhập email"); return true; }
        if (TextUtils.isEmpty(edtPassword.getText()))  { edtPassword.setError("Nhập mật khẩu"); return true; }
        return false;
    }
}
