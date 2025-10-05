package com.quang436.loginprofile;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private MaterialToolbar toolbar;
    private TextView tvProfileName, tvEmail, tvPhone, tvSkype, tvWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = findViewById(R.id.toolbar);
        tvProfileName = findViewById(R.id.tvProfileName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        tvSkype = findViewById(R.id.tvSkype);
        tvWeb = findViewById(R.id.tvWeb);

        // Set navigation back to previous (Login)
        toolbar.setNavigationOnClickListener(v -> finish());
        toolbar.setOnMenuItemClickListener(this::onToolbarItemSelected);

        // Nhận dữ liệu từ Login và hiển thị
        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String skype = getIntent().getStringExtra("skype");
        String web = getIntent().getStringExtra("web");

        tvProfileName.setText(username != null ? username : "User");
        tvEmail.setText("email : " + (email != null ? email : "unknown"));
        tvPhone.setText("phone : " + (phone != null ? phone : "unknown"));
        tvSkype.setText("skype : " + (skype != null ? skype : "unknown"));
        tvWeb.setText("web : " + (web != null ? web : "unknown"));

        // Nút back hệ thống cũng quay về Login
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override public void handleOnBackPressed() { finish(); }
        });
    }

    private boolean onToolbarItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {

            new AlertDialog.Builder(this)
                    .setTitle("Settings")
                    .setMessage("Quay về màn hình Login?")
                    .setPositiveButton("OK", (DialogInterface dialog, int which) -> finish())
                    .setNegativeButton("Cancel", null)
                    .show();
            return true;
        }
        return false;
    }
}
