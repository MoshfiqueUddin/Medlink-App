package com.example.cse299;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class doctors extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<modelDoc> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        initData();
        initRecyclerView();


    }

    private void initData() {

        userList= new ArrayList<>();

        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Moshfique", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Alvi", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));
        userList.add(new modelDoc(R.drawable.doc,"Dr.Rohit", "MBBS", "Dhaka Medical College", "______________________________"));


    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new Adapter(userList,getApplicationContext());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}