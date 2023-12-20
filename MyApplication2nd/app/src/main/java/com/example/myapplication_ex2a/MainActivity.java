package com.example.myapplication_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRouge  = findViewById(R.id.btnRed);
        Button btnVert  = findViewById(R.id.btnGreen);
        Button btnBleu  = findViewById(R.id.btnBlue);
        FrameLayout myLayout = (FrameLayout) findViewById(R.id.pannelCouleur);

        btnRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "red background !", Toast.LENGTH_LONG).show();
                myLayout.setBackgroundColor(Color.RED);
            }});

        btnVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "green background !", Toast.LENGTH_LONG).show();
                myLayout.setBackgroundColor(Color.GREEN);
            }
        });
        btnBleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "blue background !", Toast.LENGTH_LONG).show();
                myLayout.setBackgroundColor(Color.BLUE);
            }
        });


    }}