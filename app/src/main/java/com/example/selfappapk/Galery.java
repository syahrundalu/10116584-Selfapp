package com.example.selfappapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Galery extends AppCompatActivity {

    ImageView homeButton, dailyButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);

        homeButton = findViewById(R.id.beranda);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Galery.this, Home.class));
            }
        });

        dailyButton = findViewById(R.id.daily);
        dailyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Galery.this, dailyActivity.class));
            }
        });
    }
}