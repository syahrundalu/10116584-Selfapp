package com.example.selfappapk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dailyActivity extends AppCompatActivity {

    ImageView homeButton, galeryButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);


        homeButton = findViewById(R.id.beranda);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dailyActivity.this, Home.class));
            }
        });

        galeryButton = findViewById(R.id.galery);
        galeryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dailyActivity.this, Galery.class));
            }
        });
    }


}