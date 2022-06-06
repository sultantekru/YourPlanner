package com.sultantekru.yourplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotActivity extends AppCompatActivity {
    private ImageView notadd;
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
    }
}