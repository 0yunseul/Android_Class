package com.example.project01_clone.chat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project01_clone.R;

public class ChatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //Intent intent = getIntent();
        getIntent().getSerializableExtra("dto");



    }
}