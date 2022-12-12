package com.example.project_clone.running;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.project_clone.R;
import com.google.android.material.tabs.TabLayout;


public class RunningFragment extends Fragment {
    TabLayout tab_running;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_running, container, false);
        tab_running = v.findViewById(R.id.tab_running);
        tab_running.addTab(tab_running.newTab().setText("바로 시작"));
        tab_running.addTab(tab_running.newTab().setText("러닝 가이드"));

        tab_running.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return v;
    }
}