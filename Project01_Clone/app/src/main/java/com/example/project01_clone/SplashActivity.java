package com.example.project01_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    //Splash 화면 : 사용자에게 자연스럽게 광거 배너나 브랜드 이미지를 노출시킴으로써 브랜드의 이미지를 각인시킴.
    //또는 해당하는 이미지를 노출하는 동안 백그라운드에서는 데이터 로딩 작업을 할 수 있음.

    //Handler : 메인 쓰레드를 이용해서 딜레이를 주는 기능을 이용할때 사용.
    // -> 방법 외우거나 깊이 공부할 필요 없음
    //화면에 앱이 보여주는 액티비티의 순서나 등록된 모든 컴포넌트 관리 : androidManifest.xml (이건 알아야됭)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //ProgressDialog : 사용자 입장에서 중요한 UI요소
        //→ 사용자는 현재 앱이 멈춘건지 데이터 로딩을 위해서 시간이 소요되는 중인지 판단 불가하기때문에  빈번하게 사용된다.

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("데이터 로딩");
        dialog.setMessage("로딩중");
        dialog.setCancelable(false);
        dialog.show(); //실제로 화면에 보이게 만드는 메소드

        //MainActivity 로 화면을 넘겨주는 방법 : thread, RunOnUiThread, Handler

        //1.Handler사용하기
/*          ★ Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

         new Handler().postDelayed(r ,1000*5);*/

  
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 //토스트메세지 보이게하기 (5초뒤)
                 Toast.makeText(SplashActivity.this, "토스트메세지", Toast.LENGTH_SHORT).show();
                 dialog.dismiss(); //안보이게처리

                 //SplashActivity ->MainActivity로 화면전환
                 //Activity간의 전환 --> Intent가 필요한것!  (통신에 필요함)
                 Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                 startActivity(intent);
             }
        },1000*1);

    }
}