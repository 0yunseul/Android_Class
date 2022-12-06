package com.example.and11_allview.recycler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;


public class RecyclerFragment extends Fragment {
RecyclerView recv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_recycler, container, false);

        /*recycler찾기*/
        recv = v.findViewById(R.id.recv);
        
        /*어댑터 연결 -RecvAdapter에 생성자 선언*/
        recv.setAdapter(new RecvAdapter(inflater));
        
        // *  리사이클러 뷰는 가로 뷰와 세로 뷰를 제공한다 ->LayoutManger필요함. 
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext() ,RecyclerView.VERTICAL,false

        );//getContext() 역할은 화면에 떠있게하는거 -activity가 화면에 뜨는 대표적 객체, fragment는 액티비티에게 내가 화면에 있다고 알려야하는데 그걸 context가 하는거..?  /나 띄워져있어요 ,가로or세로 모드로,보여질순서(db연결시필요)
        recv.setLayoutManager(manager); //

        return  v;
    }
}