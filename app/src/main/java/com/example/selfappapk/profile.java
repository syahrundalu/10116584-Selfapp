package com.example.selfappapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class profile extends AppCompatActivity {


    ImageView homeButton, dailyButton, galeryButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String iframeUrl = "<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d15844.462502158343!2d107.6096949!3d-6.876748!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x32792e0613a0a6d9%3A0xd5cf19f324b55b49!2sPerumahan%20Kayubulan%20Permai%20Latorong!5e0!3m2!1sid!2sid!4v1684425956221!5m2!1sid!2sid\" width=\"600\" height=\"450\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe>";
        String htmlData = "<html><body>" + iframeUrl + "</body></html>";

        webView.loadDataWithBaseURL(null, htmlData, "text/html", "UTF-8", null);

        homeButton = findViewById(R.id.home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(profile.this, Home.class));
            }
        });

        dailyButton = findViewById(R.id.daily);
        dailyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(profile.this, dailyActivity.class));
            }
        });

        galeryButton = findViewById(R.id.galery);
        galeryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(profile.this, Galery.class));
            }
        });
    }
}