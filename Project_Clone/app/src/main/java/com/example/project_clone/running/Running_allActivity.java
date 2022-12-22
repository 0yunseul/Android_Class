package com.example.project_clone.running;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.project_clone.R;

import java.util.ArrayList;

public class Running_allActivity extends AppCompatActivity {
    RecyclerView recv_running_all;
    RunningAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_all);
        recv_running_all = findViewById(R.id.recv_running_all);

        ArrayList<RunDTO> list = new ArrayList<>();
        list.add(new RunDTO(R.drawable.run_m_4,"30 Minute Head Stats","A 30minute run with 1minute of post run guidance and cool down.","30 Min · Run"));
        list.add(new RunDTO(R.drawable.run_short_2,"3 Minute Run", "3분의 편안한 러닝","3분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_m_2,"5K Head Starts", "A comfortable 5K run. This is a distance based audio guided run.","5K· Run"));
        list.add(new RunDTO(R.drawable.run_short_1,"7MINUTE RUN", "7분의 편안한 러닝","7분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_m_7,"Another Thank You Run", "Relaxed and inspiring 45 minute easy run with 1 minute of post ru...","45 Min· Run"));
        list.add(new RunDTO(R.drawable.run_t_1,"Big Treadmill Run", "An easy and relaxed 60-minute run.","60 Min · Run"));
        list.add(new RunDTO(R.drawable.run_short_3,"Comeback Run", "15분의 편안한 러닝","15분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_m_3,"Don't Wanna Run Run", "A 25 minute run with 1 minute of post run guidance and coll down.","25 Min · Run"));
        list.add(new RunDTO(R.drawable.run_g6,"First Long Run", "35분의 편안한 러닝","35분 운동 · 장거리 러닝"));
        list.add(new RunDTO(R.drawable.run_g5,"First Run", "20분 편안한 러닝 + 3분 쿨다운.","23분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_speed_1,"First Speed Run", "5K페이스로 1분씩 8회 인터벌. 인터벌 중간 1분씩 회복","25분 운동 · 스피드런"));
        list.add(new RunDTO(R.drawable.run_g7,"First Treadmill Run", "A comfortable 24 minue run qith 1 minute of post run guidance and...","24 Min · Treadmill Run"));
        list.add(new RunDTO(R.drawable.run_long_1,"Go 4 40", "40분 가벼운 러닝 + 1분 쿨다운","40분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_speed_3,"Go Getter", "5분 워밍업 3분 10k 페이스 1분 마일 페이스 2분 5K 페이스 1분 마일 페...","35분 운동 운동 · 스피드 런"));
        list.add(new RunDTO(R.drawable.run_t_6,"Half & Half", "6:Warm up 4:00 Easy 2:00 hard 3:00 Easy 1:30 Hard 1:30 Easy 3:...","29 Min · TreadMill Run"));
        list.add(new RunDTO(R.drawable.run_m_6,"I need A Win Run", "A 30 minute run with 1 minute of post run guidance and cool down.","30 Min · Run"));
        list.add(new RunDTO(R.drawable.run_long_2,"Just Go", "35분 회복 러닝 + 1분 쿨다운","36분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_t_4,"Little Treadmill Run", "15 minute easy run specially made for the treadmill with 1 minute of ...","315 Min · Treadmill Run"));
        list.add(new RunDTO(R.drawable.run_g4,"Next Run", "22분 편안한 러닝 + 2분 쿨다운","24분 운동 · 회복 러닝"));
        list.add(new RunDTO(R.drawable.run_speed_2,"Next Speed Run", "5K,10K,마일 페이스, 셀러브레이션 페이스 인터벌. 인터벌 중간 1분씩 회복","25분 운동 운동 · 스피드 런"));
        list.add(new RunDTO(R.drawable.run_t_5,"Running Highs", "30 minute recovery run specially made for the treadmill. You will re...","30 Min ·Treadmill Run"));
        list.add(new RunDTO(R.drawable.run_m_5,"Thank You Run", "A 45 minute easy run with 1 minute of post run guidance and cool do...","45 Min · Run"));
        list.add(new RunDTO(R.drawable.run_t_3,"The Roller Coaster", "A 20 minute easy run specially made for the treadmill. You will re...","20 Min · Treadmill Run"));
        list.add(new RunDTO(R.drawable.run_t_2,"Tiny TreadmillRun", "10-minute easy run specially made for the treadmill with one minute...","10 Min · Run"));
        list.add(new RunDTO(R.drawable.run_m_1,"Tough Day Easy Run", "A comfortable and relaxed 20-minute recovery run with one min...","20 Min · Run"));
        list.add(new RunDTO(R.drawable.run_t_7,"Treadhills", "5:00 Warm up Workout: 2:00 10K pace - 3% elevation 1:00 5K pac..","25 Min · Treadmill Run"));


       RecyclerView.LayoutManager manager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
       adapter = new RunningAdapter(getLayoutInflater(),list);

       recv_running_all.setAdapter(adapter);
       recv_running_all.setLayoutManager(manager);

    }
}