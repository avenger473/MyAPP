package com.example.aman.myapp;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class magicalplayer extends AppCompatActivity implements SensorEventListener{
    SensorManager sm;
    Sensor s;
    MediaPlayer mp1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magicalplayer);
        mp1= MediaPlayer.create(this,R.raw.c);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        b1=(Button)findViewById(R.id.back12);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.stop();
                Intent k= new Intent(magicalplayer.this, seventh.class);
                startActivity(k);
                finish();
            }
        });



    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.values[0]>5)
        {
            mp1.start();
        } else
        {
            mp1.pause();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
