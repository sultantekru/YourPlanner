package com.sultantekru.yourplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TodolistEklemeActivity extends AppCompatActivity {
    private Button ekle;
    private EditText eklenicek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist_ekleme);
        ekle=findViewById(R.id.btn_ekle);
        eklenicek=findViewById(R.id.edittext_eklenicek);

        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eklenicek.setText("");
                Toast.makeText(getApplicationContext(),"Eklendi",Toast.LENGTH_LONG).show();
            }
        });
    }
}