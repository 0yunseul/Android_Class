package com.example.project_clone.home;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.project_clone.R;

import java.util.Set;
import java.util.zip.Inflater;

public class UserProfileActivity extends AppCompatActivity {
    ImageView close;
    LinearLayout ln_1,ln_2,ln_3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        close = findViewById(R.id.close);
        ln_1 = findViewById(R.id.ln_1);
        ln_2 = findViewById(R.id.ln_2);
        ln_3 = findViewById(R.id.ln_3);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        /*내 러닝화*/
        ln_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfileActivity.this,ShoesActivity.class);
                startActivity(intent);
            }
        });
        /*패스*/
        ln_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfileActivity.this,PassActivity.class); //현재 activity명시, 다음 activity class
                startActivity(intent);

            }
        });
        
        /*설정*/
        ln_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(UserProfileActivity.this,SettingActivity.class);
            startActivity(intent);
            }
        });
    }
}