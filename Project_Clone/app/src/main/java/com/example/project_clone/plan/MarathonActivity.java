package com.example.project_clone.plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.project_clone.R;

public class MarathonActivity extends AppCompatActivity {
    VideoView v;

    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathon);
        back = findViewById(R.id.back);
        v = findViewById(R.id.vv);

        /*뒤로가기*/
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        /*비디오뷰*/
        Uri videouri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.marathon_video);
        v.setMediaController(new MediaController(this));
        v.setVideoURI(videouri);
        v.setMinimumHeight(450);
        v.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                v.start();
            }
        });


    /*    btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarathonActivity.this, VideoViewActivity.class);
                startActivity(intent);
            }
        });*/


        /*learn 누르면 연결 오류 액티비티로 연결
        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarathonActivity.this,DisconnActivity.class);
                startActivity(intent);
            }
        });
*/


    }
}