package com.example.ezfind;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DialogSignUp extends AppCompatActivity {

    Button mBtnProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_sign_up);

        mBtnProceed = findViewById(R.id.btnProceed);
        /*mBtnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DialogSignUp.this, SignInActivity.class);
                startActivity(intent);
            }
        });*/
    }

}
