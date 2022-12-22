package com.example.project_clone.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.project_clone.R;

import java.util.ArrayList;

public class SettingActivity extends AppCompatActivity {
    ImageView back;
    RecyclerView recv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        recv =findViewById(R.id.recv);
        ArrayList<SettingDTO> list= new ArrayList<>();
        list.add(new SettingDTO("내 정보"));
        list.add(new SettingDTO("측정 단위"));
        list.add(new SettingDTO("러닝 설정")); 
        list.add(new SettingDTO("파트너"));
        list.add(new SettingDTO("개인 정보 보호")); 
        list.add(new SettingDTO("알림 기본 설정"));
        list.add(new SettingDTO("프로필 표시 여부"));
        list.add(new SettingDTO("차단한 사용자"));
        list.add(new SettingDTO("친구 태깅"));
        list.add(new SettingDTO("친구 리더보드")); 
        list.add(new SettingDTO("운동 정보"));
        list.add(new SettingDTO("국가/지역"));
        list.add(new SettingDTO("언어"));
        list.add(new SettingDTO("쇼핑 설정"));
        list.add(new SettingDTO("버전 정보"));
        list.add(new SettingDTO("이용 약관"));
        list.add(new SettingDTO("개인 정보 취급 방침"));
        list.add(new SettingDTO("문의하기"));
        list.add(new SettingDTO("계정 삭제"));
        
        
        SettingAdapter adapter = new SettingAdapter(getLayoutInflater(),list);
        recv.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recv.setLayoutManager(manager);


    }
}