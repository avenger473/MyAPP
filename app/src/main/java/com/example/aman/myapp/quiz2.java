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

public class quiz2 extends AppCompatActivity {
    Button b1,b2;
    RadioButton r1,r2,r3,r4;
    TextView t1;
    RadioGroup rg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        b1=(Button)findViewById(R.id.back10);
        b2=(Button)findViewById(R.id.submit3);

        t1=(TextView)findViewById(R.id.textView3);

        r1=(RadioButton)findViewById(R.id.radioButton4);
        r2=(RadioButton)findViewById(R.id.radioButton5);
        r3=(RadioButton)findViewById(R.id.radioButton6);
        r4=(RadioButton)findViewById(R.id.radioButton7);

        rg1= (RadioGroup)findViewById(R.id.rg2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (r1.isChecked()) {
                    ++quiz1.score;
                    Toast.makeText(quiz2.this, "Bravo! Your answer is right!!!", Toast.LENGTH_SHORT).show();
                } else {
                    --quiz1.score;
                }
                Intent i = new Intent(quiz2.this, quiz3.class);
                startActivity(i);
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(quiz2.this, quiz1.class);
                startActivity(j);
                finish();
            }
        });






    }
}
