package com.example.genikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button ginger_yes,ginger_no,smoking_yes,smoking_no,alcohol_yes,alcohol_no,stress_yes,stress_no,submit,gs_yes,gs_no;
    EditText pushup;
    TextView textView9;
    int score=0;
    public static ArrayList <String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pushup=findViewById(R.id.pushupet);
        textView9=findViewById(R.id.textView9);
        ginger_yes=findViewById(R.id.ginger_yes);
        ginger_no=findViewById(R.id.ginger_no);
        smoking_yes=findViewById(R.id.smoking_yes);
        smoking_no=findViewById(R.id.smoking_no);
        alcohol_yes=findViewById(R.id.alcohol_yes);
        alcohol_no=findViewById(R.id.alcohol_no);
        stress_yes=findViewById(R.id.stress_yes);
        stress_no=findViewById(R.id.stress_no);
        gs_yes=findViewById(R.id.gs_yes);
        gs_no=findViewById(R.id.gs_no);
        submit=findViewById(R.id.submit);
        list=new ArrayList<>();

        ginger_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1;
            }
        });
        ginger_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score;
                list.add("Regular Exercise makes you fit");
            }
        });
        alcohol_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1;

            }
        });
        alcohol_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score;
                list.add("Alcohol is injurious to health");
            }
        });
        stress_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1;

            }
        });
        stress_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score;
                list.add("Do yoga and meditation");
            }
        });
        smoking_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1;

            }
        });
        smoking_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score;
                list.add("Smoking causes Cancer");
            }
        });
        gs_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score+=1;
            }
        });
        gs_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score;
                list.add("Wear mask");
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("SCORE",score);
                startActivity(intent);
            }
        });
    }

    public void ML(View view) {
        String a = pushup.getText().toString();
        int b2 = Integer .parseInt(a);
        int y = (int) (-7.044*b2+49.732);
        textView9.setText("Improvement in Immunity against Covid-19 by Percentage"+y);
    }
}