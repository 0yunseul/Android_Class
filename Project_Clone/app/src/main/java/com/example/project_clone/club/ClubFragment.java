package com.example.project_clone.club;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_clone.R;
import com.google.android.material.tabs.TabLayout;

public class ClubFragment extends Fragment {
    TabLayout tab_club;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_club, container, false);
        tab_club = v.findViewById(R.id.tab_club);
        tab_club.addTab(tab_club.newTab().setText("리더 보드"));
        tab_club.addTab(tab_club.newTab().setText("챌린지"));


        tab_club.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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

        return  v;
    }
}