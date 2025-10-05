package com.quang436.loginprofile;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText edtUser, edtPass;
    private MaterialButton btnLogin;
    private TextView tvForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgot = findViewById(R.id.tvForgot);

        btnLogin.setOnClickListener(v -> doLogin());
        tvForgot.setOnClickListener(v ->
                Toast.makeText(this, "Demo: liên hệ admin để reset mật khẩu!", Toast.LENGTH_SHORT).show()
        );
    }

    private void doLogin() {
        String user = edtUser.getText() == null ? "" : edtUser.getText().toString().trim();
        String pass = edtPass.getText() == null ? "" : edtPass.getText().toString();

        if (TextUtils.isEmpty(user)) {
            edtUser.setError("Nhập User Name");
            return;
        }
        if (TextUtils.isEmpty(pass)) {
            edtPass.setError("Nhập Password");
            return;
        }

        // Demo: coi như đăng nhập thành công, chuyển sang Profile
        Intent i = new Intent(this, ProfileActivity.class);
        i.putExtra("username", user);
        i.putExtra("email", user.toLowerCase() + "@mail.com");
        i.putExtra("phone", "+84 999 555 222");
        i.putExtra("skype", user.toLowerCase());
        i.putExtra("web", "https://example.com/" + user.toLowerCase());
        startActivity(i);
    }
}
