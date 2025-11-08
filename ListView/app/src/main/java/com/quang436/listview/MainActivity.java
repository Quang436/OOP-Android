package com.quang436.listview // đổi thành package của bạn (vd: com.quang436.bai8)

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView lvSubjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSubjects = findViewById(R.id.lvSubjects);

        // Lấy mảng môn học từ resources
        String[] monHoc = getResources().getStringArray(R.array.ds_mon_hoc);

        // Adapter mặc định 1 dòng chữ
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                monHoc
        );
        lvSubjects.setAdapter(adapter);

        // Click 1 dòng -> Toast tên môn
        lvSubjects.setOnItemClickListener((parent, view, position, id) -> {
            String tenMon = parent.getItemAtPosition(position).toString();
            Toast.makeText(MainActivity.this, tenMon, Toast.LENGTH_SHORT).show();
        });
    }
}
