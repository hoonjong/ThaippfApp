package com.cookandroid.registerloginexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DangiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangi);
    }


    public void test1(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://overseas.mofa.go.kr/th-ko/brd/m_3243/view.do?seq=961459&srchFr=&amp;srchTo=&amp;srchWord=&amp;srchTp=&amp;multi_itm_seq=0&amp;itm_seq_1=0&amp;itm_seq_2=0&amp;company_cd=&amp;company_nm=&page=1"));
                startActivity(intent);
    }

    public void test2(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tour.interpark.com/freeya/Discovery/View.aspx?seq=11650"));
        startActivity(intent);
    }

    public void test3(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.blog.naver.com/PostView.nhn?blogId=sonagi2042&logNo=110046753981&proxyReferer=https:%2F%2Fwww.google.com%2F"));
        startActivity(intent);
    }

    public void test4(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://brunch.co.kr/@keemjungwan/8"));
        startActivity(intent);
    }


}