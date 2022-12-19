package com.example.lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
   EditText id, pw;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id = findViewById(R.id.edt_id);
        pw = findViewById(R.id.edt_pw);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().equals("admin") && pw.getText().toString().equals("admin_pw")) {
               Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                }
            }

        });

    }
}