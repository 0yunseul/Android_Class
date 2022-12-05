package com.example.and11_allview.carrot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class C_Fragment extends Fragment {
    RecyclerView c_recv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v  =  inflater.inflate(R.layout.fragment_c, container, false); //View v 에 담는 처리

       c_recv = v.findViewById(R.id.c_recv); //리사이클러뷰 찾아오기

        //데이터 담기
        ArrayList<C_DTO> list = new ArrayList<>();



       //어댑터 연결
        C_Adapter adapter = new C_Adapter(getLayoutInflater(),list);
        c_recv.setAdapter(adapter);




       RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
       c_recv.setLayoutManager(manager);
       return v;
    }
}