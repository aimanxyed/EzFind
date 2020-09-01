package com.example.ezfind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ezfind.HelperClasses.MyRequests.MyRequestsAdapter;
import com.example.ezfind.HelperClasses.MyRequests.MyRequestsHelperClass;

import java.util.ArrayList;

public class MyRequests extends AppCompatActivity {
    RecyclerView requests_recycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_requests);
        requests_recycler= findViewById(R.id.recyclerview);
        RecyclerRequests();

    }
    private void RecyclerRequests(){
        requests_recycler.setHasFixedSize(true);
        requests_recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        ArrayList<MyRequestsHelperClass> myRequestsHelperClasses = new ArrayList<>();
        myRequestsHelperClasses.add(new MyRequestsHelperClass(R.drawable.windshield,"Windscreen for Volksvagen", " 22-Feb-2017", "Auto part"));
        myRequestsHelperClasses.add(new MyRequestsHelperClass(R.drawable.windshield,"Windscreen for Volksvagen", " 22-Feb-2017", "Auto part"));
        myRequestsHelperClasses.add(new MyRequestsHelperClass(R.drawable.windshield,"Windscreen for Volksvagen", " 22-Feb-2017", "Auto part"));
        myRequestsHelperClasses.add(new MyRequestsHelperClass(R.drawable.windshield,"Windscreen for Volksvagen", " 22-Feb-2017", "Auto part"));
        myRequestsHelperClasses.add(new MyRequestsHelperClass(R.drawable.windshield,"Windscreen for Volksvagen", " 22-Feb-2017", "Auto part"));

        adapter = new MyRequestsAdapter(myRequestsHelperClasses);
        requests_recycler.setAdapter(adapter);



    }
}
