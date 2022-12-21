package com.example.project_clone.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.project_clone.R;
import com.example.project_clone.running.RunningFragment;


public class HomeFragment extends Fragment {


    ImageView user_img;
    TextView all;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        user_img = v.findViewById(R.id.user);
        all = v.findViewById(R.id.all);
        btn = v.findViewById(R.id.start_running);


        user_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),UserProfileActivity.class); //현재 activity명시, 다음 activity class
                getContext().startActivity(intent);

            }

        });


        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),AllActivity.class);
                getContext().startActivity(intent);
            }
        });

        /*버튼클릭시 러닝 프래그먼트로 이동*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                
            }
        });

        return v;
    }


}
