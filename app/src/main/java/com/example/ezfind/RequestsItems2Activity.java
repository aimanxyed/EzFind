package com.example.ezfind;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestsItems2Activity extends AppCompatActivity {
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requests_items2);
        submit= findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(RequestsItems2Activity.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_dialog_signin, null);
                alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();



            }
        });
    }
}
