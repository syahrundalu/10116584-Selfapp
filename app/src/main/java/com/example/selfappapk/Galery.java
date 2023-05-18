package com.example.selfappapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Galery extends AppCompatActivity {

    ImageView homeButton, dailyButton;
    ImageView playGravity, pauseGravity, stopGravity;
    ImageView playFlyAway, pauseFlyAway, stopFlyAway;

    MediaPlayer gravity, flyaway;


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

        gravity = MediaPlayer.create(this, R.raw.gravity);

        playGravity = findViewById(R.id.play_gravity);
        pauseGravity = findViewById(R.id.pause_gravity);
        stopGravity = findViewById(R.id.stop_gravity);

        playGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravity.start();
            }
        });

        pauseGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravity.pause();
            }
        });

        stopGravity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravity.stop();
                gravity.prepareAsync();
            }
        });

        flyaway = MediaPlayer.create(this, R.raw.flyaway);

        playFlyAway = findViewById(R.id.play_flyAway);
        pauseFlyAway = findViewById(R.id.pause_flyAway);
        stopFlyAway = findViewById(R.id.stop_flyAway);

        playFlyAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flyaway.start();
            }
        });

        pauseFlyAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flyaway.pause();
            }
        });

        stopFlyAway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flyaway.stop();
                flyaway.prepareAsync();
            }
        });

        }
    }