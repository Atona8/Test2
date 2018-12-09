package com.example.libo.mytest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

        List<String> stringList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            stringList.add(String.format(Locale.CHINA, "第" + i + "条数据"));
        }
        adapter = new MyAdapter(this,stringList);
        recyclerView.setAdapter(adapter);
    }
}
