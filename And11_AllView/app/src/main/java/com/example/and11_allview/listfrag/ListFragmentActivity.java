package com.example.and11_allview.listfrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class ListFragmentActivity extends Fragment {
    ListView list_frag;
    ArrayList<ListFragDTO> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v =  inflater.inflate(R.layout.fragment_list, container, false);
        //fragment_list의 속성들 v에 담는다.
       list_frag = v.findViewById(R.id.listv_frag);

        //adapter 연결한다.
        ListFrag_Adapter adapter = new ListFrag_Adapter(getLayoutInflater(),list);
        list_frag.setAdapter(adapter);

        //데이터를 ArrayList에 추가한다.
        list.add(new ListFragDTO("중고나라",1));


       return v;
    }
}