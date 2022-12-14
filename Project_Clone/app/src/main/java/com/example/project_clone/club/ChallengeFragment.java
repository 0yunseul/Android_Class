package com.example.project_clone.club;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;

import java.util.ArrayList;

public class ChallengeFragment extends ClubFragment {
    RecyclerView recv_ch;
    Context context;
    ArrayList<ChallengeDTO> list = new ArrayList<>();
    TextView tv_ch_1, tv_ch_2,tv_ch_3;

    int[]imgARR = {
            R.drawable.small_15k,
            R.drawable.small_5k,
            R.drawable.small_10k,
            R.drawable.small_100k,
            R.drawable.small_25k,
            R.drawable.small_30k
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_challange, container, false);
        for (int i = 0; i < 5; i++) {
            list.add(new ChallengeDTO(i,"주간챌린지","달려보세요","4일남음"));

        }
        recv_ch = v.findViewById(R.id.recv_ch);

       recv_ch.setAdapter(new ChallengeAdapter(inflater,list,getContext()));
        return v;
    }
}
