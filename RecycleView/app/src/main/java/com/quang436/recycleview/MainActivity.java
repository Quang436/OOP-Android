package com.quang436.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView_2332;
    private StudentAdapter studentAdapter_2332;
    private List<Student> studentList_2332;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo RecyclerView
        recyclerView_2332 = findViewById(R.id.recycler_view_2332);
        recyclerView_2332.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_2332.setHasFixedSize(true);

        // Tạo dữ liệu mẫu
        studentList_2332 = new ArrayList<>();
        studentList_2332.add(new Student("Pham Le Thieu Quang", 2332));
        studentList_2332.add(new Student("Kevin", 22));
        studentList_2332.add(new Student("Raeed", 21));
        studentList_2332.add(new Student("Rakib", 28));
        studentList_2332.add(new Student("Arun", 24));
        studentList_2332.add(new Student("Bruce", 26));
        studentList_2332.add(new Student("Stark", 35));
        studentList_2332.add(new Student("Steve", 104));
        studentList_2332.add(new Student("Natasha", 24));
        studentList_2332.add(new Student("Rock", 40));
        studentList_2332.add(new Student("Phạm Lê Thiệu Quang", 100));
        studentList_2332.add(new Student("Tony", 45));
        studentList_2332.add(new Student("Peter", 18));
        studentList_2332.add(new Student("Thor", 1500));
        studentList_2332.add(new Student("Loki", 1000));

        // Khởi tạo Adapter và gắn vào RecyclerView
        studentAdapter_2332 = new StudentAdapter(studentList_2332);
        recyclerView_2332.setAdapter(studentAdapter_2332);
    }
}