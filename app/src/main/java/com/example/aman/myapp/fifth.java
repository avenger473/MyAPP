package com.example.aman.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fifth extends AppCompatActivity {
    TextView t1,t2;
    Button b1,b2,b3,b4,b5,b6,b7;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.calculator);

        b1=(Button)findViewById(R.id.back7);
        b2=(Button)findViewById(R.id.sum);
        b3=(Button)findViewById(R.id.substraction);
        b4=(Button)findViewById(R.id.multiply);
        b5=(Button)findViewById(R.id.division);
        b6=(Button)findViewById(R.id.reset);
        b7=(Button)findViewById(R.id.result);

        e1=(EditText)findViewById(R.id.number1);
        e2=(EditText)findViewById(R.id.number2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(fifth.this, third.class);
                startActivity(i);
                finish();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();

                float k= Float.parseFloat(s1)+Float.parseFloat(s2);

                String s=Float.toString(k);

                t1.setText(s);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();

                float k= Float.parseFloat(s1)-Float.parseFloat(s2);

                String s=Float.toString(k);

                t1.setText(s);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();

                float k= Float.parseFloat(s1)*Float.parseFloat(s2);

                String s=Float.toString(k);

                t1.setText(s);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= e1.getText().toString();
                String s2= e2.getText().toString();

                float k= Float.parseFloat(s1)/Float.parseFloat(s2);

                String s=Float.toString(k);

                t1.setText(s);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l= new Intent(fifth.this, fifth.class);
                startActivity(l);
                finish();
                
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= t1.getText().toString();
                Toast.makeText(fifth.this, s, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
