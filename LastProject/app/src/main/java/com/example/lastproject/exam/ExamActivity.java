package com.example.lastproject.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.conn.ApiClient;
import com.example.conn.CommonMethod;
import com.example.lastproject.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class ExamActivity extends AppCompatActivity {

    Button btn1, btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        ApiClient.setBASEURL("http://192.168.0.45/middle/");

        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        btn4=findViewById(R.id.btn_4);
        btn5=findViewById(R.id.btn_5);

        CommonMethod c = new CommonMethod();


           /*


            c.setParams("test","테스트").sendPost("test1", new CommonMethod.CallBackResult() {
                @Override
                public void result(boolean isResult, String data) {

                }
            });*/
        btn1.setOnClickListener( v -> { //lamda식
 /*                   new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //test1요청 : 데이터를 따로 필요로 하지 않음.
    new CommonMethod().sendPost("test1", new CommonMethod.CallBackResult() {
            @Override
            public void result(boolean isResult, String data) {
                //spring에서 return을 줘야만 있는 부분
                Log.d("로그", "result: "+isResult);  
            }
        });*/
                new CommonMethod().sendPost("test1",((isResult, data) -> {
                    
                }));
        });

        btn2.setOnClickListener(v -> {
            c.setParams("a","요").setParams("b","청").setParams("c","함").sendPost("test2",((isResult, data) -> {
            }));
        });

        //btn3 : return 있음
        btn3.setOnClickListener(v->{
            c.sendPost("test3", new CommonMethod.CallBackResult() {
                @Override
                public void result(boolean isResult, String data) {
                    Log.d("로그", "result: "+ data);
                }
            });

        });


        //데이터 타입이 각각 다른 (int iVal, sVal, dVal)를 가진 VO를 만들고 받아오기
        //vo 가져오기 어케가능?
        //commonmethod로 요청 후 result메소드에서 해당 코드가 정상 작동하면 된다.
        btn4.setOnClickListener(v -> {
           c.sendPost("test4", new CommonMethod.CallBackResult() {
               @Override
               public void result(boolean isResult, String data) {
                   Log.d("로그", "result: " +data );
                   //Android에 똑같은 형태의 VO가 있는 상태에서 바꿔보기
                   ExamVO vo = new Gson().fromJson(data, ExamVO.class);
                   //fromJson (String이나 json으로 되어있는 바꾸고 싶은 데이터, 바꾸고싶은 타입);

                   Log.d("로그", "result: "+vo.sVal);
                   Log.d("로그", "result: "+vo.iVal);
                   Log.d("로그", "result: "+vo.dVal);

               }
           });
        });

        btn5.setOnClickListener(v->{
            //숫자값 보내기
            c.setParams("num","1").sendPost("test5", new CommonMethod.CallBackResult() {
                @Override
                public void result(boolean isResult, String data) {

                }
            });


            c.sendPost("test5", new CommonMethod.CallBackResult() {
                @Override
                public void result(boolean isResult, String data) {
                    Log.d("로그", "result: "+data);
//                 ArrayList를 안드로이드로 받기위해서  typtoken이 필요 ->, new TypeToken<ArrayList<ExamVO>>(){}.getType()
                    ArrayList<ExamVO> list = new Gson().fromJson(data, new TypeToken<ArrayList<ExamVO>>(){}.getType());
                    Log.d("로그", "result: "+list.size());

                }
            });
        });


    }

    public class ExamVO {
        private String sVal;
        private int iVal;
        private double dVal;
        public String getsVal() {
            return sVal;
        }
        public void setsVal(String sVal) {
            this.sVal = sVal;
        }
        public int getiVal() {
            return iVal;
        }
        public void setiVal(int iVal) {
            this.iVal = iVal;
        }
        public double getdVal() {
            return dVal;
        }
        public void setdVal(double dVal) {
            this.dVal = dVal;
        }

    }
}