package com.example.lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.conn.ApiClient;
import com.example.conn.CommonMethod;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiClient.setBASEURL("http://192.168.0.45/middle/"); //팀플할때 자기것으로 ip바꾸면된다.


        new CommonMethod().setParams("data" , "KYM")
        .sendGet("andVo", new CommonMethod.CallBackResult() {
            @Override
            public void result(boolean isResult, String data) {
            if(isResult) {
                Log.d("로그", "result: "+data);
            }
            }
        });
    }
}