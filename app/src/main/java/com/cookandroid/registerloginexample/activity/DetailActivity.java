package com.cookandroid.registerloginexample.activity;



import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

/** 해당 액티비티는 선교지 소식 액티비티에 사용되는 CardView 및 인텐트로 넘겨주는 내용을 받아오는 곳 입니다.
 *
 *
 */
public class DetailActivity extends AppCompatActivity {

    private Intent intent;
    private TextView tv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailsosic);

        // MainActivity에서 보낸 imgRes를 받기위해 getIntent()로 초기화
        intent = getIntent();
        tv1 = (TextView) findViewById(R.id.content);

        // "imgRes" key로 받은 값은 int 형이기 때문에 getIntExtra(key, defaultValue);
        // 받는 값이 String 형이면 getStringExtra(key);
        //tv1.getString(intent.getIntExtra("text", 0));
       // getIntent().getStringExtra("title");
        tv1.setText(intent.getStringExtra("title"));

    }
}



