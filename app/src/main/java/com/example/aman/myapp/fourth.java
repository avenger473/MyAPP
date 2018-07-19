package com.example.aman.myapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class fourth extends AppCompatActivity {
    ImageView iv1;
    Button b1,b2, b3;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        iv1=(ImageView)findViewById(R.id.imageView2);
        b1=(Button)findViewById(R.id.back3);
        b2=(Button)findViewById(R.id.button8);
        b3=(Button)findViewById(R.id.button7);
        mp= MediaPlayer.create(this, R.raw.c);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                Intent k= new Intent(fourth.this, third.class);
                startActivity(k);
                finish();
            }
        });




    }
}
