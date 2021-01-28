package com.cookandroid.registerloginexample.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

/** 선교편지 and 기도제목 액티비티 입니다.
 *  기능 중 버튼 클릭하여 선교사님께서 보내주시는 선교편지를 intent로 받아오는 기능이 있는데
 *  이 기능을 주기적으로 유지보수를 해야함 --> 좋은 방법이나 있나 재구상 필요
 *
 */
public class PrayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pray);


    }

    public void test1(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1RpOnlmeVXt31daeOLZsIN4rZAOIHTDz-/view?usp=sharing"));
        startActivity(intent);
    }

}
