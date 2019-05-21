package com.example.gerganzhekov.moduleevaluationquiz;

/**
 * Created by Gergan Zhekov on 08/12/2017.
 */

// Code for splash screen

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity); //use splash_screen layout
        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000); //5 seconds to show it
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class); //after that go to MainActivity
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
