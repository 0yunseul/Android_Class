package com.example.project_clone.plan;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;

import com.example.project_clone.R;
import com.example.project_clone.activity.AddActivity;
import com.example.project_clone.home.UserProfileActivity;

import java.util.ArrayList;


public class PlanFragment extends Fragment {
    RecyclerView recv_p;
    ImageView user;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_plan, container, false);

        recv_p = v.findViewById(R.id.recv_plan);
        user = v.findViewById(R.id.user);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),UserProfileActivity.class);
                startActivity(intent);
            }
        });


        ArrayList<PlanDTO> list = new ArrayList<>();
        for (int i = 0; i<4;i++){
            list.add(new PlanDTO(R.drawable.item_plan_1,R.string.plan_p1_tv1,R.string.plan_p1_tv2,R.string.plan_btn_1));
            list.add(new PlanDTO(R.drawable.item_plan_2,R.string.plan_p2_tv1,R.string.plan_p2_tv2,R.string.plan_btn_2));
            list.add(new PlanDTO(R.drawable.item_plan_3,R.string.plan_p3_tv1,R.string.plan_p3_tv2,R.string.plan_btn_3));
            list.add(new PlanDTO(R.drawable.item_plan_4,R.string.plan_p4_tv1,R.string.plan_p4_tv2,R.string.plan_btn_4));
        }

        PlanAdapter a = new PlanAdapter(getLayoutInflater(),list,getContext());
        recv_p.setAdapter(a);

        RecyclerView.LayoutManager m = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recv_p.setLayoutManager(m);


        return v;
    }
}