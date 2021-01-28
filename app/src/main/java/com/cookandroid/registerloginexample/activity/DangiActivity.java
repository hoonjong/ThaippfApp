package com.cookandroid.registerloginexample.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

/**
 * 단기 선교 준비 액티비티 입니다.
 * 해당 액티비티는 태국 단기 선교를 가기전 태국의 역사 및 문화 등 다양한 내용을 공부할 수 있도록
 * 텍스트뷰로 내용이 저장되어 있습니다.
 * (내용이 고정되어 있는 만큼, 내용을 더 다듬는 작업을 진행해야 함.)
 *
 *
 * 현재 기능은 버튼 클릭시 네이버 블로그 및 페이지를 참조하여 태국 자세히 들여다보기, 태국 간단히 들여다보기 등
 * 의 내용이 포함되어 있습니다.
 */

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