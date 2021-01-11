package com.cookandroid.registerloginexample;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.Unuse.FirstivActivity;
import com.cookandroid.registerloginexample.WebView.BlogActivity;
import com.cookandroid.registerloginexample.WebView.FacebookActivity;
import com.cookandroid.registerloginexample.WebView.WebViewActivity;
import com.cookandroid.registerloginexample.WebView.YoutubeActivity;
import com.cookandroid.registerloginexample.httpUtil.LoginActivity;
import com.cookandroid.registerloginexample.httpUtil.RegisterActivity;

public class Firstiv extends AppCompatActivity {
    private ImageView imageView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstiv);

        setView();


        AlertDialog.Builder dlg = new AlertDialog.Builder(Firstiv.this);
        dlg.setTitle("현재 준비중 입니다."); //제목
        dlg.setMessage("불편을 드려서 죄송합니다.");

        dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        dlg.show();

    }

    private void setView() {
        imageView1 = findViewById(R.id.imageView1);


        imageView1.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.imageView1:
                    intent = new Intent(Firstiv.this, SungoSogaeActivity.class);
                    startActivity(intent);
                    break;

            }
        }

    };
}