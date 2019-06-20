package com.example.tanmay.newsappretrofit.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.tanmay.newsappretrofit.R;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView= findViewById(R.id.abcd);
        final String url = getIntent().getStringExtra("url");
        webView.loadUrl(url);
    }
}

