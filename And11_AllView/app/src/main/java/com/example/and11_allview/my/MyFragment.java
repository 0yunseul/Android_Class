package com.example.and11_allview.my;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;

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
        recv_my.setAdapter(new MyAdapter(inflater)); //어댑터 연결
        

        return v;
    }
}