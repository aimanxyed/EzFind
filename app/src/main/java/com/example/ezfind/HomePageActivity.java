package com.example.ezfind;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePageActivity extends AppCompatActivity {
     TextView More;
     TextView More2;
     BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        Intent intent = new Intent(HomePageActivity.this, HomePageActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.products:
                        intent = new Intent(HomePageActivity.this, ProductActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.cart:
                        intent = new Intent(HomePageActivity.this, CartActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.wishlist:
                        intent = new Intent(HomePageActivity.this, MyReviewsActivity.class);
                        startActivity(intent);
                        break;


                }
                return true;

            }

        });
        More = findViewById(R.id.More_one);
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, HomeActivity.class);
                startActivity(intent);







        }








    });}}

