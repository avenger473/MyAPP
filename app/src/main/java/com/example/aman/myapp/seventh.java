package com.example.aman.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class seventh extends AppCompatActivity {
    Button b1, b2, b3;
    ImageView iv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        b1 = (Button) findViewById(R.id.back11);
        b2 = (Button) findViewById(R.id.quiz);
        b3 = (Button) findViewById(R.id.mp3);
        iv1 = (ImageView) findViewById(R.id.imageView4);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(seventh.this, magicalplayer.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(seventh.this, quiz1.class);
                startActivity(j);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(seventh.this, third.class);
                startActivity(k);
                finish();
            }
        });
    }
}
