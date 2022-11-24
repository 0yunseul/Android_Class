package com.example.and08_activityintent;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NoneContext {
   LayoutInflater inflater;
       public NoneContext(LayoutInflater inflater){
           this.inflater = inflater;
       }

   public void method1(){
       //NoneContext.class의 layout inflater를 null이 아닌 상태로 만들기
       if (inflater == null){
           Log.d("인플레이터", "null ");
       }else{
           Log.d("인플레이터", "not null ");
       }
    }

    public  void showToast(MainActivity activity){
        Toast.makeText(activity, "토스트..", Toast.LENGTH_SHORT).show();
    }
    //v1Setting 메소드를 MainActivity에서 호출
    //v1은   MainActivity의 View v1

    public  void v1Setting(View v1){
        TextView tv_sub1 = v1.findViewById(R.id.tv_sub1);
        tv_sub1.setText("텍스트뷰 글씨 바꾸기");
        Button btn_sub1 = v1.findViewById(R.id.btn_sub1);
        btn_sub1.setText("버튼 글씨 바꾸기");
    }
}
