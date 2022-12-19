package com.example.project_clone.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//import com.bumptech.glide.Glide;
import com.example.project_clone.R;
import com.example.project_clone.UserProfileActivity;


public class ActivityFragment extends Fragment {

    ImageView user_img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View v = inflater.inflate(R.layout.fragment_activity,container,false);

    user_img = v.findViewById(R.id.user);
    user_img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getContext(),UserProfileActivity.class);
           startActivity(intent);

        }
    });


     return v;
    }
}