package com.example.project_clone.running;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.project_clone.R;
import com.google.android.material.tabs.TabLayout;


public class RunningFragment extends Fragment {
    TabLayout tab_running;
    Fragment now, guide;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_running, container, false);

        now = new NowFragment();
        guide = new GuideFragment();

       // getChildFragmentManager().beginTransaction().replace(R.id.run_frame,now).commit();

        tab_running = v.findViewById(R.id.tab_running);
        tab_running.addTab(tab_running.newTab().setText("바로 시작"));
        tab_running.addTab(tab_running.newTab().setText("러닝 가이드"));

        tab_running.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected = null;
                if(position == 0){
                    selected = now;
                }else if (position == 1){
                    selected = guide;
                }
                getChildFragmentManager().beginTransaction().replace(R.id.run_frame,selected).commit();
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