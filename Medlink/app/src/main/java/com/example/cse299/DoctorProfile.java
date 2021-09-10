package com.example.cse299;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DoctorProfile extends AppCompatActivity {
    ImageView img;
    TextView tv1,tv2,tv3;
    private Button appointment;
    private Button appointment1;
    private Button appointment2;
    private Button appointment3;
    private Button appointment4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_profile);

        appointment = (Button) findViewById(R.id.appoint);
        appointment1 = (Button) findViewById(R.id.appoint1);
        appointment2 = (Button) findViewById(R.id.appoint2);
        appointment3 = (Button) findViewById(R.id.appoint3);
        appointment4 = (Button) findViewById(R.id.appoint4);
        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/spreadsheets/d/1aIdAcalTL-oIwtItlOz5eAbzUBOd2DRa8tG80OWx2do/edit#gid=0");
            }
        });
        appointment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/spreadsheets/d/1aIdAcalTL-oIwtItlOz5eAbzUBOd2DRa8tG80OWx2do/edit#gid=0");
            }
        });
        appointment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/spreadsheets/d/1aIdAcalTL-oIwtItlOz5eAbzUBOd2DRa8tG80OWx2do/edit#gid=0");
            }
        });
        appointment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/spreadsheets/d/1aIdAcalTL-oIwtItlOz5eAbzUBOd2DRa8tG80OWx2do/edit#gid=0");
            }
        });
        appointment4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://docs.google.com/spreadsheets/d/1aIdAcalTL-oIwtItlOz5eAbzUBOd2DRa8tG80OWx2do/edit#gid=0");
            }
        });

        img=(ImageView)findViewById(R.id.docImg);
        tv1=(TextView)findViewById(R.id.docName);
        tv2=(TextView)findViewById(R.id.docAge);
        tv3=(TextView)findViewById(R.id.docPge);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("name"));
        tv2.setText(getIntent().getStringExtra("time"));
        tv3.setText(getIntent().getStringExtra("mssg"));
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}