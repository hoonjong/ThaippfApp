package com.cookandroid.registerloginexample.WebView;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;
//웹뷰 PPF 블로그 연결
public class BlogActivity extends AppCompatActivity {

    private WebView webview2;

    private WebSettings mWebSettings2;


    // webView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);


        webview2 = (WebView) findViewById(R.id.webView2);


        webview2.setWebViewClient(new WebViewClient());
        mWebSettings2 = webview2.getSettings();
        mWebSettings2.setJavaScriptEnabled(true);
        mWebSettings2.setLoadWithOverviewMode(true);
        mWebSettings2.setUseWideViewPort(true);
        mWebSettings2.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWebSettings2.setCacheMode(WebSettings.LOAD_NO_CACHE);
        mWebSettings2.setDomStorageEnabled(true);
        webview2.loadUrl("https://m.blog.naver.com/PostList.nhn?permalink=permalink&blogId=thai_ppf&proxyReferer=https:%2F%2Fl.instagram.com%2F");

    }
}