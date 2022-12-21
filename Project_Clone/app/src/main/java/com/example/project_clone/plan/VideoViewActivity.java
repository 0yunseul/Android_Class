package com.example.project_clone.plan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.project_clone.R;
import com.example.project_clone.home.PassActivity;
import com.example.project_clone.home.UserProfileActivity;

public class VideoViewActivity extends AppCompatActivity {
    VideoView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        Uri videouri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.marathon_video);
        v.setMediaController(new MediaController(this));
        v.setVideoURI(videouri);
        v.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                v.start();
            }
        });


    }
}