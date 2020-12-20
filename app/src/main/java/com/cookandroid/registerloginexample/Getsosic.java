package com.cookandroid.registerloginexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Getsosic extends AppCompatActivity {
//테스트중
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* xml과 연결 */

        Intent intent = getIntent();
        String str1 = intent.getExtras().getString("msg");
    }
}









