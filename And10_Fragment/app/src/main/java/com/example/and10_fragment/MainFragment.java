package com.example.and10_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainFragment extends Fragment {
    Button btn_main_frag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_main, container, false);

        btn_main_frag = v.findViewById(R.id.btn_main_frag);
        btn_main_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "토스트", Toast.LENGTH_SHORT).show();
            }
        });
        return v;
        // btn_main_frag = //find 안되는 이유 : activity가 아니라서.

    }
}