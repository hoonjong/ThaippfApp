package com.cookandroid.registerloginexample.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.cookandroid.registerloginexample.R;

public class Firstiv extends AppCompatActivity {
   // private ImageView imageView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sogae);

       // setView();



    }
/*
    private void setView() {
        imageView1 = findViewById(R.id.imageView1);


        imageView1.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.imageView1:
                    intent = new Intent(Firstiv.this, SungoSogaeActivity.class);
                    startActivity(intent);
                    break;

            }
        }

    };

 */
}
