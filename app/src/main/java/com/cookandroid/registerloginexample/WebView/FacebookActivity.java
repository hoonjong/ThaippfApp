package com.cookandroid.registerloginexample.WebView;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

public class FacebookActivity extends AppCompatActivity {

    private WebView webview1;


    private WebSettings mWebSettings1;


    // webView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);


        webview1 = (WebView) findViewById(R.id.webView1);


        webview1.setWebViewClient(new WebViewClient());
        mWebSettings1 = webview1.getSettings();
        mWebSettings1.setJavaScriptEnabled(true);
        mWebSettings1.setLoadWithOverviewMode(true);
        mWebSettings1.setUseWideViewPort(true);
        mWebSettings1.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWebSettings1.setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWebSettings1.setDomStorageEnabled(true);
        webview1.loadUrl("https://www.facebook.com/Promise-Partners-Foundation-1826656970920170");


    }
}





