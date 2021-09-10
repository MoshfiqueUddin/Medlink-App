package com.example.cse299;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Catagory extends AppCompatActivity {
    private ImageButton doctorList;
    private ImageButton doctorList1;
    private ImageButton doctorList2;
    private ImageButton doctorList3;
    private ImageButton doctorList4;
    private ImageButton doctorList5;
    private ImageButton doctorList6;
    private ImageButton doctorList7;
    private ImageButton doctorList8;
    private ImageButton doctorList9;
    private ImageButton doctorList10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        doctorList = (ImageButton) findViewById(R.id.dentist);
        doctorList1 = (ImageButton) findViewById(R.id.cardiology);
        doctorList2 = (ImageButton) findViewById(R.id.ent);
        doctorList3 = (ImageButton) findViewById(R.id.dermatology);
        doctorList4 = (ImageButton) findViewById(R.id.medicine);
        doctorList5 = (ImageButton) findViewById(R.id.respi);
        doctorList6 = (ImageButton) findViewById(R.id.neuro);
        doctorList7 = (ImageButton) findViewById(R.id.mentalhealth);
        doctorList8 = (ImageButton) findViewById(R.id.eye);
        doctorList9 = (ImageButton) findViewById(R.id.ortho);
        doctorList10 = (ImageButton) findViewById(R.id.surgery);


        doctorList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
openDoctors();
            }
        });
        doctorList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
        doctorList10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctors();
            }
        });
    }
    public void openDoctors(){
        Intent intent = new Intent(this, doctors.class);
        startActivity(intent);
    }

}