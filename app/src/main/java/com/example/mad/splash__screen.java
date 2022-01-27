package com.example.mad;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.window.SplashScreen;

public class splash__screen extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        boolean b = new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(splash__screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }3000);
    }
}