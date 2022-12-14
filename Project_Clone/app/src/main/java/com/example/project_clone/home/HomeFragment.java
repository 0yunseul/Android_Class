package com.example.project_clone.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.project_clone.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    ViewPager2 sliderViewPager;
    LinearLayout layoutIndicator;
    int[] imgArr = {
            R.drawable.home_01,
            R.drawable.home_02,
            R.drawable.home_03,
            R.drawable.home_04,
            R.drawable.home_05,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ArrayList<HomeDTO> list = new ArrayList<>();
        for (int i = 0; i <6; i++){
            list.add(new HomeDTO(i));
        }


        return v;
    }

}