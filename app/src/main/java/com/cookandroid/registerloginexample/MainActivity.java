package com.cookandroid.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

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
                    insta = findViewById(R.id.insta);
                    insta.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                            startActivity(intent);

                        }
                    });

                case R.id.facebook:
                    facebook = findViewById(R.id.facebook);
                    facebook.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), FacebookActivity.class);
                            startActivity(intent);

                        }
                    });


                case R.id.naver:
                    naver = findViewById(R.id.naver);
                    naver.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), BlogActivity.class);
                            startActivity(intent);
                        }
                    });

                case R.id.youtube:
                    youtube = findViewById(R.id.youtube);
                    youtube.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplicationContext(), YoutubeActivity.class);
                            startActivity(intent);
                        }
                    });
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
                    sign = findViewById(R.id.sign);
                    sign.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this , LoginActivity.class);
                            startActivity(intent);

                        }
                    });

                /*case R.id.test:
                    test = findViewById(R.id.test);
                    test.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this , TestFirebase.class);
                            startActivity(intent);
                        }
                    });*/







            }

        }



    };
}
