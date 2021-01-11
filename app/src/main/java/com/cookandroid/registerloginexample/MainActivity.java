package com.cookandroid.registerloginexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, insta, facebook, naver, youtube, test;
    private ListView m_oListView = null;
    //private ImageView insta, facebook, naver;
    private Button webview_btn, register, sign;

    //생명주기 onCreate - onStart - onResume 문제있으면 수정해야 함. 아직까진 괜찮은 상황 - 2020.12.20
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
        imageView7 = findViewById(R.id.imageView7);
        insta = findViewById(R.id.insta);
        facebook = findViewById(R.id.facebook);
        naver = findViewById(R.id.naver);
        youtube = findViewById(R.id.youtube);
        //     register = findViewById(R.id.register);
        sign = findViewById(R.id.sign);
        insta = findViewById(R.id.insta);
        facebook = findViewById(R.id.facebook);
        naver = findViewById(R.id.naver);
        youtube = findViewById(R.id.youtube);
        //     sign = findViewById(R.id.sign);


        imageView1.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        imageView5.setOnClickListener(onClickListener);
        imageView6.setOnClickListener(onClickListener);
        imageView7.setOnClickListener(onClickListener);
        insta.setOnClickListener(onClickListener);
        facebook.setOnClickListener(onClickListener);
        naver.setOnClickListener(onClickListener);
        youtube.setOnClickListener(onClickListener);
//        register.setOnClickListener(onClickListener);
//        sign.setOnClickListener(onClickListener);
        insta.setOnClickListener(onClickListener);
        facebook.setOnClickListener(onClickListener);
        naver.setOnClickListener(onClickListener);
        youtube.setOnClickListener(onClickListener);
        //    sign.setOnClickListener(onClickListener);
        //  test.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.imageView1:
                    // intent = new Intent(MainActivity.this, Firstiv.class);
                    // startActivity(intent);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setTitle("현재 준비중 입니다."); //제목
                    dlg.setMessage("불편을 드려서 죄송합니다.");

                    dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    dlg.show();
                    break;
                case R.id.imageView2:
                    intent = new Intent(MainActivity.this, SosicActivity.class);
                    startActivity(intent);
                    break;
                case R.id.imageView3:
                    AlertDialog.Builder dlo = new AlertDialog.Builder(MainActivity.this);
                    dlo.setTitle("현재 준비중 입니다."); //제목
                    dlo.setMessage("불편을 드려서 죄송합니다.");
                    dlo.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    dlo.show();
                    // Toast.makeText(MainActivity.this, "이 페이지는 현재 준비중입니다. 불편을 드려 죄송합니다.", Toast.LENGTH_SHORT).show();
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
                case R.id.imageView7:
                    intent = new Intent(MainActivity.this, BibleActivity.class);
                    startActivity(intent);
                    break;
                case R.id.insta:
                    intent = new Intent(MainActivity.this, WebViewActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "인스타그램 페이지를 여는중입니다. \n 잠시만 기다려주세요", Toast.LENGTH_LONG).show();
                    break;
                case R.id.facebook:
                    intent = new Intent(MainActivity.this, FacebookActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "페이스북 페이지를 여는중입니다.  \n 잠시만 기다려주세요", Toast.LENGTH_LONG).show();
                    break;
                case R.id.naver:
                    intent = new Intent(MainActivity.this, BlogActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "블로그 페이지를 여는중입니다. \n  잠시만 기다려주세요", Toast.LENGTH_LONG).show();
                    break;
                case R.id.youtube:
                    intent = new Intent(MainActivity.this, YoutubeActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "유튜브 채널을 여는중입니다. \n  잠시만 기다려주세요", Toast.LENGTH_LONG).show();
                    break;
                    /*
                case R.id.register:
                    register = findViewById(R.id.register);
                    register.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                            startActivity(intent);
                        }
                    });
                case R.id.sign:
                    intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    break;
*/

            }

        }


    };


    //액션버튼 메뉴 액션바에 집어 넣기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //액션버튼을 클릭했을때의 동작
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //or switch문도 이용가능^^
        if (id == R.id.action_chat) {
            Intent email = new Intent(Intent.ACTION_SEND);
            Toast.makeText(this, "G_Mail 링크를 연결해드리겠습니다.", Toast.LENGTH_SHORT).show();
            email.setType("plain/text");
            // email setting 배열로 해서 복수 발송 가능
            String[] address = {"qkr7627@gmail.com"};
            email.putExtra(Intent.EXTRA_EMAIL, address);
            email.putExtra(Intent.EXTRA_SUBJECT, "개발자님 문의합니다.");  //Gmail 제목 고정
            email.putExtra(Intent.EXTRA_TEXT, "부족한 점이 많을 수 있습니다. 욕설 및 비하발언은 삼가해주시기 바랍니다.\n (이 내용은 지우고 작성하시면 됩니다.)"); // 내용 고정
            startActivity(email);
            return true;
        }
        if (id == R.id.action_share) {
            Intent msg = new Intent(Intent.ACTION_SEND);
            msg.addCategory(Intent.CATEGORY_DEFAULT);
            msg.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.cookandroid.registerloginexample");
            msg.putExtra(Intent.EXTRA_TITLE, "제목");
            msg.setType("text/plain");
            startActivity(Intent.createChooser(msg, "앱을 선택해 주세요"));
            return true;
        }

        return super.onOptionsItemSelected(item);
    } //onOptionsItemSelected의 끝


}
