package com.example.ezfind.HelperClasses.MyRequests;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezfind.R;

import java.util.ArrayList;

public class MyRequestsAdapter extends RecyclerView.Adapter<MyRequestsAdapter.MyRequestsViewHolder>{

    ArrayList<MyRequestsHelperClass> myRequestsHelperClasses;

    public MyRequestsAdapter(ArrayList<MyRequestsHelperClass> myRequestsHelperClasses) {
        this.myRequestsHelperClasses = myRequestsHelperClasses;
    }

    @NonNull
    @Override
    public MyRequestsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        MyRequestsViewHolder myRequestsViewHolder = new MyRequestsViewHolder(view);
        return myRequestsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRequestsViewHolder holder, int position) {
        MyRequestsHelperClass myRequestsHelperClass = myRequestsHelperClasses.get(position);
        holder.image.setImageResource(myRequestsHelperClass.getImage());
        holder.title.setText(myRequestsHelperClass.getTitle());
        holder.description.setText(myRequestsHelperClass.getDescription());
        holder.date.setText(myRequestsHelperClass.getDate());

    }

    @Override
    public int getItemCount() {
        return myRequestsHelperClasses.size();
    }

    public static class MyRequestsViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title , date, description;
        public MyRequestsViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.txt1);
            date = itemView.findViewById(R.id.txt2);
            description = itemView.findViewById(R.id.txt3);


        }
    }
}
