package com.cookandroid.registerloginexample.WebView;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

public class WebViewActivity extends AppCompatActivity {
    private WebView mWebView; // 웹뷰 선언
    private WebView webview1;
    private WebView webview2;
    private WebSettings mWebSettings;//웹뷰세팅
    private WebSettings mWebSettings1;
    private WebSettings mWebSettings2;

   // webView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        mWebView = (WebView) findViewById(R.id.webView);



        mWebView.setWebViewClient(new WebViewClient());
        mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        mWebSettings.setLoadWithOverviewMode(true);
        mWebSettings.setUseWideViewPort(true);
        mWebSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWebSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWebSettings.setDomStorageEnabled(true);
        mWebView.loadUrl("https://instagram.com/thai_ppf?igshid=b5wy4hil2tsh");





    }
}