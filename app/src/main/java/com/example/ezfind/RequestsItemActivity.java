package com.example.ezfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestsItemActivity extends AppCompatActivity {

    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests_item);
         proceed = findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestsItemActivity.this, RequestsItems2Activity.class);
                startActivity(intent);

            }
        });
    }
}
