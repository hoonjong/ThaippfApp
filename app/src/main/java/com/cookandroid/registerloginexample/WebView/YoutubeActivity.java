package com.cookandroid.registerloginexample.WebView;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

public class YoutubeActivity extends AppCompatActivity {

    private WebView webView3;


    private WebSettings mWebSettings3;


    // webView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);


        webView3 = (WebView) findViewById(R.id.webView3);


        webView3.setWebViewClient(new WebViewClient());
        mWebSettings3 = webView3.getSettings();
        mWebSettings3.setJavaScriptEnabled(true);
        mWebSettings3.setLoadWithOverviewMode(true);
        mWebSettings3.setUseWideViewPort(true);
        mWebSettings3.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWebSettings3.setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWebSettings3.setDomStorageEnabled(true);
        webView3.loadUrl("https://www.youtube.com/channel/UCxSf0oId2vZMoeMLCoLwPKg/featured");


    }
}

