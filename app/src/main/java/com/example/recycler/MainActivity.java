package com.example.recycler;


import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Context context = MainActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new BooksAdapter(getMyList(), context);
        recyclerView.setAdapter(adapter);

    }


    public ArrayList<String> getMyList() {
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            a.add("Artem");
        }

        return a;
    }


}