package com.example.project_clone.home;

import android.content.Intent;
import android.os.Bundle;
import com.example.project_clone.MainActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.project_clone.R;

import java.nio.channels.InterruptedByTimeoutException;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        return v;
    }
}