package com.example.aman.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quiz1 extends AppCompatActivity {
    Button b1,b2;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    RadioGroup rg1;
    static  int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        b1=(Button)findViewById(R.id.back9);
        b2=(Button)findViewById(R.id.submit2);

        t1=(TextView)findViewById(R.id.textView2);

        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton1);
        r3=(RadioButton)findViewById(R.id.radioButton2);
        r4=(RadioButton)findViewById(R.id.radioButton3);

        rg1= (RadioGroup)findViewById(R.id.rg1);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                if (r3.isChecked()) {
                    ++score;
                    Toast.makeText(quiz1.this, "Bravo! Your answer is right!!!", Toast.LENGTH_SHORT).show();
                } else {
                    --score;
                }
                Intent i = new Intent(quiz1.this, quiz2.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(quiz1.this, seventh.class);
                startActivity(j);
                finish();
            }
        });







    }
}
