package com.example.project_clone.plan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_clone.R;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        getSupportActionBar().hide();
    }
}