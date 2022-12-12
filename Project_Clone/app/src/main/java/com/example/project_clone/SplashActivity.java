package com.example.project_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //SplashActivity ->MainActivity로 화면전환
                //Activity간의 전환 --> Intent가 필요한것!  (통신에 필요함)
                Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                startActivity(intent);
            }
        },1000*2);
    }
}