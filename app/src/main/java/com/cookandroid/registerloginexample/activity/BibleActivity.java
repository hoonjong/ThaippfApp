package com.cookandroid.registerloginexample.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

/**
 * 말씀 카드 뽑기 액티비티 입니다.
 * 기능 : 말씀 보기 버튼을 클릭시 저장된 ImageView 이미지 (말씀이미지)를 랜덤으로 보여줍니다.
 * To DO LIST
 *  1.현재 이미지가 앱 내 저장되어있어서 용량을 차지하는데, 이 부분 해소하고 크롤링으로
 *  표현할 수 있도록 할 예정.
 */


public class BibleActivity extends AppCompatActivity {
    private Button btn;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);

        btn = (Button) findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = (int) (Math.random() * 10) + 1; //1부터 6까지 정수가 무작위로 생성


                if (index == 1) {
                    imageView.setImageResource(R.drawable.bible1);
                } else if (index == 2) {
                    imageView.setImageResource(R.drawable.bible2);
                } else if (index == 3) {
                    imageView.setImageResource(R.drawable.bible3);
                } else if (index == 4) {
                    imageView.setImageResource(R.drawable.bible4);
                } else if (index == 5) {
                    imageView.setImageResource(R.drawable.bible5);
                } else if (index == 6) {
                    imageView.setImageResource(R.drawable.bible6);
                } else if (index == 7) {
                    imageView.setImageResource(R.drawable.bible7);
                } else if (index == 8) {
                    imageView.setImageResource(R.drawable.bible8);
                } else if (index == 9) {
                    imageView.setImageResource(R.drawable.bible9);
                } else if (index == 10) {
                    imageView.setImageResource(R.drawable.bible10);
                }


            }
        });

    }

}



