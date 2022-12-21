package com.example.project_clone.activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//import com.bumptech.glide.Glide;
import com.bumptech.glide.Glide;
import com.example.project_clone.R;


public class ActivityFragment extends Fragment {

    ImageView gif;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View v = inflater.inflate(R.layout.fragment_activity,container,false);


    gif = v.findViewById(R.id.gif_img);
        Glide.with(this).load(R.drawable.activity_main).into(gif);

     return v;
    }
}