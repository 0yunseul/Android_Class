package com.example.and04_framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    ImageView imgv1, imgv2, imgv3;  //선언
    int count = 0;  //count버튼 누를때 (횟수) 는 int로 저장된다. 변수는 메소드 내부에 선언하면 전체에서 못쓰지.


    //이미지뷰 3개를 하나를 자료구조로 묶어보기
    //1.배열
   ImageView[] images = new ImageView[3]; //3개 저장할거임 (null로 3개 들어가있음)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        //이미지뷰 3개를 하나를 자료구조로 묶은거에 값 담기

        images[0] = findViewById(R.id.imgv1);
        images[1] = findViewById(R.id.imgv2);
        images[2] = findViewById(R.id.imgv3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //이전 이미지 0-2-1-0-2-.....
                count--;
                //조건 : -1이 되면 안됨
                if (count == -1)
                    count = 2;

                imgChange();
            }
        }); //이전이미지

        btn2.setOnClickListener(new View.OnClickListener() { //버튼2 클릭시  행해지는 구현부를 선언한다.
            @Override
            public void onClick(View v) {
                //조건 : 3이 되면 안됨
                count++;
                if (count == 3)
                    count = 0;


                imgChange();

            }//클릭 될 때마다 실행되는 부분--다음 이미지
        }); //파라메터가 interface인 메소드 setter (?)
    }

    public class jyOnclickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.btn1) {
                count--;
                if (count == -1) count = 2;
            }else if (v.getId() == R.id.btn2) {
                count++;
                if (count == 3) count = 0;
            } imgChange();

        }
    }
public void imgChange(){
            for(int i = 0; i <images.length; i++){
                images[i].setVisibility(View.GONE);
            }images[count].setVisibility(View.VISIBLE);
        }

    // 2. 메모리  올리기
    JyOnclickListener onclick = new JyOnclickListener() {
        //멤버 : {} 사이에 있는 것
        //instance 멤버, static 멤버
            @Override
            public void onClick(String v) {
                Log.d("주영", "onClick: 온클릭 jy");
            }
        };

    //3. String v  에 값을 준다.
    //onclick.onClick("값");


    }//onCreate()


    //1.interface 만들기
    // interface 만드는 이유 : 실제 화면에 버튼이 클릭되었을때 onclick()실행되게끔하기위해
    interface JyOnclickListener {
        public void onClick(String v); //string 타입으로
    }

