package com.example.ezfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    Button mContinue;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mContinue = findViewById(R.id.btnContinueSignIn);
        mContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(SignInActivity.this, HomePageActivity.class);
              startActivity(intent);
            }
        });
        signup = findViewById(R.id.signupTV2);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);

            }
        });

    }
}
