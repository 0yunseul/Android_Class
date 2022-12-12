package com.example.project_clone.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.project_clone.R;
import com.example.project_clone.running.RunningActivity;
import com.example.project_clone.running.RunningFragment;

public class HomeFragment extends Fragment {
    Button start_running;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        start_running = v.findViewById(R.id.start_running);
        start_running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return  v;
    }
}