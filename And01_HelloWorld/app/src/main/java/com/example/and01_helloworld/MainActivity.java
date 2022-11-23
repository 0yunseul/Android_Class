package com.example.and01_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Observer : 관찰자. 감시자
    //옵저버 패턴 : 인터페이스를 활용해서 각종 위젯의 변경 상태를 감지해서 개발자에게 알려주는 형식
    //xml에서 열린 태그는 반드시 자바의 객체로 존재하고있다.
    Button btn; // 객체를 선언해준다.  -> null or 디자인파일의 버튼 일까? -> null임 . 객체를 선언만 한 상태니까

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn); //디자인에 있는 위젯을 찾아서 연결 (초기화식)
      
        //View.OnClickListener() 를 인터페이스로 넘기는법
        /*1. 인터페이스를 new 사용해서 바로 파라메터로 넘기는 방식
         btn.setOnClickListener(new 치면 Onclick~자동완성)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
         ------------------------------------------------------------
        2. 인터페이스를 미리 new로 생성해놓고 사용하는 방식
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }*/
    //3.상속을 받아서 사용하는 방식
        btn.setOnClickListener(this);
        }

    @Override
    public void onClick(View v) {
        Log.d("TAG", "onClick: ");

        Log.d("박주영", " 버튼이 클릭 됨 ");
        //버튼을 클릭을 하면 1~50의 수 중 홀수의 수를 로그로 출력하기
        // 어떤 변수  + String type  == string
        //      >  int(1) + int(2) + String = String 3
        //      int(1) + String + int(2)  =>  String 1 + int(2) > String 12
        for(int i = 0; i<50; i++){
            if (i%2 == 1){
                Log.d("박주영", i+" ");
            }
        }
    }
}
