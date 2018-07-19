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

public class second extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText7);
        e3=(EditText)findViewById(R.id.editText8);
        e4=(EditText)findViewById(R.id.editText9);
        e5=(EditText)findViewById(R.id.editText10);
        e6=(EditText)findViewById(R.id.editText11);

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.back1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k= new Intent(second.this, MainActivity.class);
                startActivity(k);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                String s6 = e6.getText().toString();



                Cursor cursor = null;
                if (s1.equals("")|| s2.equals("")|| s3.equals("")|| s4.equals("")|| s5.equals("")|| s6.equals(""))
                {
                    Toast.makeText(second.this, "Fill All!", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    SQLiteDatabase bit = openOrCreateDatabase("mesra", MODE_PRIVATE, null);
                    bit.execSQL("create table if not exists student (name varchar, password varchar, phone varchar, email varchar, city varchar)");
                    String s7 = "select * from student where name='" + s1 + "'";
                    cursor = bit.rawQuery(s7, null);
                    if (cursor.getCount() > 0) {
                        Toast.makeText(second.this, "users exists", Toast.LENGTH_SHORT).show();
                    }
                    else if(s2.compareTo(s3)==0)
                    {
                        bit.execSQL("insert into student values('" + s1 + "', '" + s2 + "', '" + s4 + "', '" + s5 + "', '" + s6 + "')");
                        Toast.makeText(second.this, "database updated!!!", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(second.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(second.this, "Password Mismatch!!!", Toast.LENGTH_SHORT).show();
                    }
                }



            }
        });


    }
}
