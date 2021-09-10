package com.example.cse299;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class user extends AppCompatActivity {

    public String fullName, age, email;

    public user(){

    }
    public user (String fullName, String age, String email){
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}