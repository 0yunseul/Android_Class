package com.example.and02_relativelayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //context (맥락)  ; 현재 화면에 보여지는 객체의 상태정보를 의미함.
        Button btn = new Button(this);
        btn.setText("자바 코드로 버튼 넣음");
        TextView tv = new TextView(this);
        tv.setText(" P J Y P J Y P J Y P J Y P J Y P J Y P J Y P J Y P J Y P J Y P J Y P J Y P J Y ");
        // 위젯 (TextView1, Button 2)  > constraintlayout 안에 위치
        ConstraintLayout layout = new ConstraintLayout(this);
        layout.addView(tv);
        layout.addView(btn);
        setContentView(layout);

        //setContentView(R.layout.activity_main);
        //디자인 연결 부분임...

            //obj 라는 변수를 선언
            /* Object obj  = null;
                obj = "aaa";
                obj = new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                };
                obj = 1;
               --likewise Object는 모든 타입을 담을 수 있는 객체 (최상위 객체)
                    >but 변수를 나눠서 사용하는 이유는 : 효율성.
                        >Object vs Stirng 인 경우 string이 더 기능이 많음(obj기능을 상속받은 자식 객체)
                -------------
                View는 object를 상속받는다.

                */


    }
}