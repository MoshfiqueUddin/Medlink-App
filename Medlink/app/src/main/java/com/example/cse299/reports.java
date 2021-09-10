package com.example.cse299;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class reports extends AppCompatActivity {
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        image1 = (ImageView) findViewById(R.id.imgReport);


        image1.setImageResource(getIntent().getIntExtra("imagename1", 0));

    }
}