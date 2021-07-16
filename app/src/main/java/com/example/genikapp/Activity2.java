package com.example.genikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    TextView score,garlic,pushup,smoking,alcohol,stress,gs;
    ArrayList <String> list=MainActivity.list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        score = findViewById(R.id.score);
        garlic=findViewById(R.id.garlic);
        pushup=findViewById(R.id.pushup);
        smoking=findViewById(R.id.smoking);
        alcohol=findViewById(R.id.alcohol);
        stress=findViewById(R.id.stress);
        gs=findViewById(R.id.gs);
        int s=getIntent().getIntExtra("SCORE",0);
        score.setText("SCORE:"+String.valueOf(s));
        if (list.contains("Garlic is good for Cancer")){
            garlic.setVisibility(View.VISIBLE);
        }
        if(list.contains("Regular Exercise makes you fit")){
            pushup.setVisibility(View.VISIBLE);
        }
        if(list.contains("Smoking causes Cancer")){
            smoking.setVisibility(View.VISIBLE);
        }
        if(list.contains("Do yoga and meditation")){
            stress.setVisibility(View.VISIBLE);
        }
        if(list.contains("Alcohol is injurious to health")){
            alcohol.setVisibility(View.VISIBLE);
        }
        if(list.contains("Go and sleep well")){
            gs.setVisibility(View.VISIBLE);
        }
        if(s>=4){
            score.setText("You are Safe");
        }
        if(s<4){
            score.setText("Unsafe..! Prone to Covid");
        }

    }
}