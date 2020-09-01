package com.example.ezfind;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    Button mContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mContinue = findViewById(R.id.btnContinueSignUp);
        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(SignUpActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_sign_up, null);
                final Button btn_proceed = (Button)mView.findViewById(R.id.btnProceed);

                alert.setView(mView);
                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();
                btn_proceed.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(SignUpActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }
                });

            }
        });
    }
}
