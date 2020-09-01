package com.example.ezfind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, SpecialActivity.class);
                startActivity(intent);
                finish();

            }
        },4000);

    }
}
