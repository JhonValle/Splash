package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash1 extends AppCompatActivity {
    public static final long SPLASH1_SCREEN_DELAY=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);

        //IMPLEMENTAR TIEMPO
        TimerTask time=new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent().setClass(Splash1.this,Splash2.class);
                startActivity(intent);
                finish();
            }
        };
        //Se ejecuta una vez cerrado
        Timer timer=new Timer();
        timer.schedule(time,SPLASH1_SCREEN_DELAY);

    }
}