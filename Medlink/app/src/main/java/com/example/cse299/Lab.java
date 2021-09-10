package com.example.cse299;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Lab extends AppCompatActivity {
    RecyclerView recyclerView2;
    LinearLayoutManager layoutManager;
    List<modelLab> userList2;
    labAdapter adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);
        initData();
        initRecyclerView();
    }
    private void initData() {

        userList2= new ArrayList<>();

        userList2.add(new modelLab(R.drawable.bloodtest,"Blood Test Report", "Diagnostic Center"));
        userList2.add(new modelLab(R.drawable.covid,"Covid Test Report",  "Diagnostic Center"));
        userList2.add(new modelLab(R.drawable.bloodtest,"Blood Test Report",  "Diagnostic Center"));




    }

    private void initRecyclerView() {

        recyclerView2=findViewById(R.id.recyclerView2);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView2.setLayoutManager(layoutManager);
        adapter2= new labAdapter(userList2,getApplicationContext());
        recyclerView2.setAdapter(adapter2);
        adapter2.notifyDataSetChanged();
    }

}