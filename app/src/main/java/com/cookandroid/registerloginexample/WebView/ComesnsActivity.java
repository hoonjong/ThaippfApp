package com.cookandroid.registerloginexample.WebView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

public class ComesnsActivity extends AppCompatActivity {
    private Button webview_btn;
    private Button webview_btn1;
    private Button webview_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comesns);


       // webview_btn = findViewById(R.id.WebView_btn);
       // webview_btn.setOnClickListener(new View.OnClickListener() {
          //  @Override
         //   public void onClick(View v) {
          //      Intent intent = new Intent(getApplicationContext(),WebViewActivity.class);
         //       startActivity(intent);
         //   }
       // });

       // webview_btn1 = findViewById(R.id.WebView_btn1);
       // webview_btn1.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View v) {
             //   Intent intent = new Intent(getApplicationContext(),FacebookActivity.class);
             //   startActivity(intent);
           // }
        //});


       //webview_btn2 = findViewById(R.id.WebView_btn2);
        //webview_btn2.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
             //   Intent intent = new Intent(getApplicationContext(),BlogActivity.class);
             //   startActivity(intent);
            //}
        //});


    }

}