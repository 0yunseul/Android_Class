package com.example.and08_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class SubActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        //MainActivity에서 사용한 intent를 통해 정보받는다.
        Intent intent = getIntent();

        String sVal = intent.getStringExtra("sVal");
        Log.d("로그", "값: "+sVal);
        //int 타입은 null사용 못함, 기본으로 담을 값 필요(보낸값이 0일수도 있으므로 정수(int) 아닌 값 담기)
        int iVal = intent.getIntExtra("iVal",-1);
        Log.d("로그", "값: "+iVal);
//////////////////////////////////////////////////////////////////////////////////////////
        MemberDTO dto =(MemberDTO) intent.getSerializableExtra("dto");
        Log.d("로그", "onCreate: "+dto.getsVal1());

        //arraylist 사이즈만
        ArrayList<MemberDTO> a = (ArrayList<MemberDTO>)intent.getSerializableExtra("list");
        Log.d("로그", "onCreate: "+a.size());

        
        
        
    }
}