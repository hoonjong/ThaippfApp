package com.cookandroid.registerloginexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

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
