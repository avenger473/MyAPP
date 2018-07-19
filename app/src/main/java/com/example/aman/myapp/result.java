package com.example.aman.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView t2;
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        b1=(Button)findViewById(R.id.back20);
        b2=(Button)findViewById(R.id.facebook);
        b3=(Button)findViewById(R.id.twitter);
        b4=(Button)findViewById(R.id.netcamp);
        b5=(Button)findViewById(R.id.home);




        t2=(TextView)findViewById(R.id.textView11);

        t2.setText("Your Score is " + quiz1.score);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(result.this, seventh.class);
                startActivity(i);
                finish();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "http://www.facebook.com";
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "http://www.twitter.com";
                Intent j= new Intent(Intent.ACTION_VIEW);
                j.setData(Uri.parse(url));
                startActivity(j);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "http://www.netcamp.in";
                Intent k= new Intent(Intent.ACTION_VIEW);
                k.setData(Uri.parse(url));
                startActivity(k);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l= new Intent(result.this, third.class);
                startActivity(l);
                finish();
            }
        });




    }
}
