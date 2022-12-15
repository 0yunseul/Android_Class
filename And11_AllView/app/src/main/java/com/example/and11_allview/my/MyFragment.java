package com.example.and11_allview.my;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class MyFragment extends Fragment {
    RecyclerView recv_my;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View v 에 담는처리
        View v = inflater.inflate(R.layout.fragment_my, container, false);

        //Recycler 찾아오기
        recv_my = v.findViewById(R.id.recv_my);

        ArrayList<MyDTO> dto = new ArrayList<>();
        for(int i = 1; i<6; i++) {
          dto.add(new MyDTO("사건의지평선","윤하",R.drawable.img1,i));
            dto.add(new MyDTO("ANTIFRAGILE","르세라핌",R.drawable.img2,i));
            dto.add(new MyDTO("Hype Boy","New Jeans",R.drawable.img3,i));
            dto.add(new MyDTO("Nxde","(여자)아이들",R.drawable.img4,i));
            dto.add(new MyDTO("After Like","아이브",R.drawable.img5,i));


        }

       MyAdapter adapter = new MyAdapter(getLayoutInflater(),dto);
       recv_my.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager( getContext(), RecyclerView.VERTICAL,false  );
        recv_my.setLayoutManager(manager);
        return v;
    }
}