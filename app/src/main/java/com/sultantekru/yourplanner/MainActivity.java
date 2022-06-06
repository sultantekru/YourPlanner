package com.sultantekru.yourplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView settings_button;
    private ImageView not_button;
    private ImageView todolist_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_YourPlanner);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        not_button=findViewById(R.id.img_not);
        todolist_button=findViewById(R.id.img_todolist);


        not_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis=new Intent(getApplicationContext(),NotActivity.class);
                startActivity(gecis);
            }
        });
        todolist_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis=new Intent(getApplicationContext(),TodolistActivity.class);
                startActivity(gecis);
            }
        });
    }
}