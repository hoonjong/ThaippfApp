package com.cookandroid.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        TextView tv1 = (TextView)findViewById(R.id.textview11);


        Intent intent = getIntent();

        String message = intent.getExtras().getString("message");
        tv1.setText(message);






    }
}
