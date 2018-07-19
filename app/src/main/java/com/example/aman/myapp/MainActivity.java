package com.example.aman.myapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.uname1);
        e2=(EditText)findViewById(R.id.pass1);
        b1=(Button)findViewById(R.id.login);
        b2=(Button)findViewById(R.id.signup);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                Cursor cursor = null;
                if (s1.equals("") || s2.equals("")) {
                    Toast.makeText(MainActivity.this, "Fill All!", Toast.LENGTH_SHORT).show();
                } else {
                    SQLiteDatabase bit = openOrCreateDatabase("mesra", MODE_PRIVATE, null);
                    bit.execSQL("create table if not exists student (name varchar, password varchar, phone varchar, email varchar, city varchar)");
                    String s4 = "select * from student where (name='" + s1 + "' and password='" + s2 + "')";
                    cursor = bit.rawQuery(s4, null);

                    if (cursor.getCount() > 0) {
                        Toast.makeText(MainActivity.this, "Login Done", Toast.LENGTH_SHORT).show();
                        Intent j = new Intent(MainActivity.this, third.class);
                        startActivity(j);
                        finish();
                    } else {
                        Toast.makeText(MainActivity.this, "Wronng user id or Password", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, second.class);
                startActivity(i);
                finish();
            }
        });
    }
}
