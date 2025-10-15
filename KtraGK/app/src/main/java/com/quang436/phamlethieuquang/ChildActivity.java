package com.quang436.phamlethieuquang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChildActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton imgbtn_2332;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.child);

        imgbtn_2332 = findViewById(R.id.imgbtn_2332);
        imgbtn_2332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
