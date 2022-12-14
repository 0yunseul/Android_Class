package com.example.project_clone.running;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class RunningAdapter extends FragmentPagerAdapter {
    LayoutInflater inflater;
    private List<Fragment> fragmentList = new ArrayList<>();

    public RunningAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm,behavior);
    }
    public void addFragment(Fragment fragment){
        fragmentList.add(fragment);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}