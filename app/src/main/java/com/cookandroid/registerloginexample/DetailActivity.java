package com.cookandroid.registerloginexample;



import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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



