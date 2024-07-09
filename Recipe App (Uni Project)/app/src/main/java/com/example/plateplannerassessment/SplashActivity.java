package com.example.plateplannerassessment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

public class SplashActivity extends AppCompatActivity {
    private long ms=0;
    private static long splashTime = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread mythread = new Thread() {
            public void run(){
                try {
                    while (ms < splashTime) {
                        ms = ms+100;
                        sleep(100);
                    }
                } catch (Exception e) {}
                finally {
                    Intent intent = new Intent(getApplicationContext(), Homepage.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        mythread.start();
    }
}
