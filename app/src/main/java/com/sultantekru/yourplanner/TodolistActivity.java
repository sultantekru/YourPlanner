package com.sultantekru.yourplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TodolistActivity extends AppCompatActivity {
    private RecyclerView todorecycle;
    private ImageView todoadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        todorecycle = findViewById(R.id.todolist);
        todorecycle.setLayoutManager(new LinearLayoutManager(this));
        TodolistAdapter todolistAdapter=new TodolistAdapter();
        todorecycle.setAdapter(todolistAdapter);

        todoadd=findViewById(R.id.img_todolistadd);

        todoadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),TodolistEklemeActivity.class);
                startActivity(intent);
            }
        });

    }
}