package com.example.ezfind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.ezfind.AllProducts.AllProductsAdapter;
import com.example.ezfind.AllProducts.AllProductsHelperClass;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView products_recycler;
    RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        products_recycler= findViewById(R.id.recyclerview);
        RecyclerProducts();
    }
    private void RecyclerProducts(){
        products_recycler.setHasFixedSize(true);
        products_recycler.setLayoutManager(new GridLayoutManager(this,2));

        ArrayList<AllProductsHelperClass> allProductsHelperClasses = new ArrayList<>();
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));
        allProductsHelperClasses.add(new AllProductsHelperClass(R.drawable.wheel,"Alloy Rim Tyre","Lorem Ipsum Semibold Vertigo Nala Upsum ","Lorem Ipsum Semibold Vertigo ","$4500"));

        adapter = new AllProductsAdapter(allProductsHelperClasses);
        products_recycler.setAdapter(adapter);


    }
}
