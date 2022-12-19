package com.example.middle_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.vertical_enter, R.anim.none);
        setContentView(R.layout.activity_test);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.none, R.anim.vertical_exit);
    }
}