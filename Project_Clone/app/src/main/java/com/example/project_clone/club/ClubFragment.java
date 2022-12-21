package com.example.project_clone.club;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.project_clone.R;
import com.example.project_clone.home.UserProfileActivity;
import com.google.android.material.tabs.TabLayout;

public class ClubFragment extends Fragment {
    TabLayout tab_club;
    Fragment board, challenge;
    ImageView user;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_club, container, false);
        user = v.findViewById(R.id.user);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UserProfileActivity.class);
                startActivity(intent);
            }
        });

        board = new BoardFragment();
        challenge = new ChallengeFragment();

        getChildFragmentManager().beginTransaction().replace(R.id.container2,board).commit();

        tab_club = v.findViewById(R.id.tab_club);
        tab_club.addTab(tab_club.newTab().setText("리더 보드"));
        tab_club.addTab(tab_club.newTab().setText("챌린지"));
        tab_club.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected = null;

                if(position == 0){
                     selected = board;
                }else if (position == 1){
                   selected = challenge;
                }
                getChildFragmentManager().beginTransaction().replace(R.id.container2,selected).commit();
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