package com.sultantekru.yourplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotActivity extends AppCompatActivity {
    private ImageView notadd;
    private RecyclerView notlar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not);

        notadd=findViewById(R.id.img_notadd);

        notadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gecis=new Intent(getApplicationContext(),NoteklemeActivity.class);
                startActivity(gecis);
            }
        });

        notlar=findViewById(R.id.notlar);
        notlar.setLayoutManager(new LinearLayoutManager(this));
        NotAdapter notAdapter = new NotAdapter();
        notlar.setAdapter(notAdapter);
    }
}