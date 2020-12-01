package com.cookandroid.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.cookandroid.registerloginexample.Unuse.FirstivActivity;
import com.cookandroid.registerloginexample.WebView.BlogActivity;
import com.cookandroid.registerloginexample.WebView.FacebookActivity;
import com.cookandroid.registerloginexample.WebView.WebViewActivity;
import com.cookandroid.registerloginexample.WebView.YoutubeActivity;
import com.cookandroid.registerloginexample.httpUtil.LoginActivity;
import com.cookandroid.registerloginexample.httpUtil.RegisterActivity;
import com.github.chrisbanes.photoview.PhotoView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6,insta,facebook, naver, youtube, test;
    private ListView m_oListView = null;
    //private ImageView insta, facebook, naver;
    private Button webview_btn, register, sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setView();


    }

    private void setView() {
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        insta = findViewById(R.id.insta);
        facebook = findViewById(R.id.facebook);
        naver = findViewById(R.id.naver);
        youtube = findViewById(R.id.youtube);
        register = findViewById(R.id.register);
        sign = findViewById(R.id.sign);
        insta = findViewById(R.id.insta);
        facebook = findViewById(R.id.facebook);
        naver = findViewById(R.id.naver);
        youtube = findViewById(R.id.youtube);
        sign = findViewById(R.id.sign);





        imageView1.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        imageView5.setOnClickListener(onClickListener);
        imageView6.setOnClickListener(onClickListener);
        insta.setOnClickListener(onClickListener);
        facebook.setOnClickListener(onClickListener);
        naver.setOnClickListener(onClickListener);
        youtube.setOnClickListener(onClickListener);
        register.setOnClickListener(onClickListener);
        sign.setOnClickListener(onClickListener);
        insta.setOnClickListener(onClickListener);
        facebook.setOnClickListener(onClickListener);
        naver.setOnClickListener(onClickListener);
        youtube.setOnClickListener(onClickListener);
        sign.setOnClickListener(onClickListener);
      //  test.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.imageView1:
                    intent = new Intent(MainActivity.this, Firstiv.class);
                    startActivity(intent);
                    break;
                case R.id.imageView2:
                    intent = new Intent(MainActivity.this, SosicActivity.class);
                    startActivity(intent);
                    break;
                case R.id.imageView3:
                    break;
                case R.id.imageView4:
                    intent = new Intent(MainActivity.this, DangiActivity.class);
                    startActivity(intent);
                    break;
                case R.id.imageView5:
                    intent = new Intent(MainActivity.this, PrayActivity.class);
                    startActivity(intent);
                    break;
                case R.id.imageView6:
                    intent = new Intent(MainActivity.this, HuwonActivity.class);
                    startActivity(intent);
                    break;
                case R.id.insta:
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "인스타그램 페이지를 여는중입니다. \n 잠시만 기다려주세요" , Toast.LENGTH_LONG).show();
                    break;
                case R.id.facebook:
                    intent = new Intent(MainActivity.this,FacebookActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "페이스북 페이지를 여는중입니다.  \n 잠시만 기다려주세요" , Toast.LENGTH_LONG).show();
                    break;
                case R.id.naver:
                    intent = new Intent(MainActivity.this,BlogActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "블로그 페이지를 여는중입니다. \n  잠시만 기다려주세요" , Toast.LENGTH_LONG).show();
                    break;
                case R.id.youtube:
                    intent = new Intent(MainActivity.this,YoutubeActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "유튜브 채널을 여는중입니다. \n  잠시만 기다려주세요" , Toast.LENGTH_LONG).show();
                    break;
                case R.id.register:
                    register = findViewById(R.id.register);
                    register.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this , RegisterActivity.class);
                            startActivity(intent);
                        }
                    });
                case R.id.sign:
                    intent = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                    break;



            }

        }



    };
}
