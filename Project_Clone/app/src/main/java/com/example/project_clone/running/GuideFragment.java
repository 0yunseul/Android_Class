package com.example.project_clone.running;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_clone.R;
import com.example.project_clone.plan.PlanAdapter;

import java.util.ArrayList;

public class GuideFragment extends Fragment {
    RecyclerView recv_collection,  recv_mind, recv_tread;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_guide,container,false);

        recv_collection = v.findViewById(R.id.recv_collection);
        recv_mind = v.findViewById(R.id.recv_mind);
        recv_tread = v.findViewById(R.id.recv_tread);

        ArrayList<GuideDTO> list_1 = new ArrayList<>();
        list_1.add(new GuideDTO(R.drawable.run_g3,"25분 운동 · 스피드 런 "));
        list_1.add(new GuideDTO(R.drawable.run_g4,"24분 운동 · 회복 러닝"));
        list_1.add(new GuideDTO(R.drawable.run_g5,"23분 운동 · 회복 러닝"));
        list_1.add(new GuideDTO(R.drawable.run_g6,"35분 운동 · 장거리 러닝"));
        list_1.add(new GuideDTO(R.drawable.run_g7,"24 Min · Treadmill Run"));



        ArrayList<GuideDTO> list_2 = new ArrayList<>();
        list_2.add(new GuideDTO(R.drawable.run_m_1,"20 Min · Run "));
        list_2.add(new GuideDTO(R.drawable.run_m_2,"5K · Run "));
        list_2.add(new GuideDTO(R.drawable.run_m_3,"25 Min · Run"));
        list_2.add(new GuideDTO(R.drawable.run_m_4,"30 Min · Run"));
        list_2.add(new GuideDTO(R.drawable.run_m_5,"45 Min · Run"));
        list_2.add(new GuideDTO(R.drawable.run_m_6,"30 Min · Run"));
        list_2.add(new GuideDTO(R.drawable.run_m_7,"45 Min · Run"));

        ArrayList<GuideDTO> list_4 = new ArrayList<>();
        list_4.add(new GuideDTO(R.drawable.run_t_1,"60 Min · Run"));
        list_4.add(new GuideDTO(R.drawable.run_t_2,"10 Min · Run"));
        list_4.add(new GuideDTO(R.drawable.run_t_3,"20 Min · Treadmill Run"));
        list_4.add(new GuideDTO(R.drawable.run_t_4,"15 Min · Treadmill Run"));
        list_4.add(new GuideDTO(R.drawable.run_t_5,"30 Min · Treadmill Run"));
        list_4.add(new GuideDTO(R.drawable.run_t_6,"29 Min · Treadmill Run"));
        list_4.add(new GuideDTO(R.drawable.run_t_7,"25 Min · Treadmill Run"));





        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        GuideAdapter adapter_1 = new GuideAdapter(getLayoutInflater(),list_1);
        recv_collection.setAdapter(adapter_1);
        recv_collection.setLayoutManager(manager);

        RecyclerView.LayoutManager manager_2 = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        GuideAdapter adapter_2 = new GuideAdapter(getLayoutInflater(),list_2);
        recv_mind.setAdapter(adapter_2);
        recv_mind.setLayoutManager(manager_2);

        RecyclerView.LayoutManager manager_4 = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
        GuideAdapter adapter_4 = new GuideAdapter(getLayoutInflater(),list_4);
        recv_tread.setAdapter(adapter_4);
        recv_tread.setLayoutManager(manager_4);








        return v;
    }
}