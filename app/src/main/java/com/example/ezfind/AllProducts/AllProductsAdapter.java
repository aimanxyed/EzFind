package com.example.ezfind.AllProducts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezfind.R;

import java.util.ArrayList;

public class AllProductsAdapter extends RecyclerView.Adapter<AllProductsAdapter.AllProductsViewHolder> {
    ArrayList<AllProductsHelperClass> allProductsHelperClasses;

    public AllProductsAdapter(ArrayList<AllProductsHelperClass> allProductsHelperClasses) {
        this.allProductsHelperClasses = allProductsHelperClasses;
    }

    @NonNull
    @Override
    public AllProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.productcv,parent,false);
        AllProductsViewHolder allProductssViewHolder = new AllProductsViewHolder(view);
        return allProductssViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AllProductsViewHolder holder, int position) {
        AllProductsHelperClass allProductsHelperClass = allProductsHelperClasses.get(position);
        holder.image.setImageResource(allProductsHelperClass.getImage());
        holder.title.setText(allProductsHelperClass.getTitle());
        holder.desc1.setText(allProductsHelperClass.getDesc1());
        holder.desc2.setText(allProductsHelperClass.getDesc2());
        holder.price.setText(allProductsHelperClass.getPrice());
        ;

    }

    @Override
    public int getItemCount() {
        return allProductsHelperClasses.size();
    }

    public class AllProductsViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title , desc1, desc2, price;
        public AllProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image1);
            title = itemView.findViewById(R.id.text1);
            desc1 = itemView.findViewById(R.id.description1);
            desc2 = itemView.findViewById(R.id.description2);
            price = itemView.findViewById(R.id.price1);
        }
    }




}
