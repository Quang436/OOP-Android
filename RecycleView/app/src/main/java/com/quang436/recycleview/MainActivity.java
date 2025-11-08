package com.quang436.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;
    private List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khởi tạo RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Tạo dữ liệu mẫu
        studentList = new ArrayList<>();
        studentList.add(new Student("Pham Le Thieu Quang", 2332));
        studentList.add(new Student("Kevin", 22));
        studentList.add(new Student("Raeed", 21));
        studentList.add(new Student("Rakib", 28));
        studentList.add(new Student("Arun", 24));
        studentList.add(new Student("Bruce", 26));
        studentList.add(new Student("Stark", 35));
        studentList.add(new Student("Steve", 104));
        studentList.add(new Student("Natasha", 24));
        studentList.add(new Student("Rock", 40));
        studentList.add(new Student("Phạm Lê Thiệu Quang", 100));
        studentList.add(new Student("Tony", 45));
        studentList.add(new Student("Peter", 18));
        studentList.add(new Student("Thor", 1500));
        studentList.add(new Student("Loki", 1000));

        // Khởi tạo Adapter và gắn vào RecyclerView
        studentAdapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(studentAdapter);
    }
}