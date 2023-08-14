package com.example.selfappapk;

/*
    NIM : 10116584
    NAMA : Muhammad Syahrun Dalu
*/


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
//    ImageView dailyButton, galeryButton, profileButton;


    private static final String CLIENT_ID = "a0b34a5674d1409d8bfe1adaa50faef4";
    private static final String REDIRECT_URI = "sanctuary";

    private WebView spotifyWeb;

    ImageView playbutton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




}