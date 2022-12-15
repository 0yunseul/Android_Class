package com.example.project_clone.club;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;

import java.util.ArrayList;

public class ChallengeFragment extends ClubFragment {

    RecyclerView recv;
    ArrayList<ChallengeDTO> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_challange, container, false);

        recv = v.findViewById(R.id.recv_ch);
        list.add(new ChallengeDTO(R.drawable.small_15k,R.string.ch_w,R.string.ch_tv2_15,"3일 남음",R.drawable.ic_arrow_right));
        list.add(new ChallengeDTO(R.drawable.small_5k,R.string.ch_w,R.string.ch_tv2_5,"3일 남음",R.drawable.ic_arrow_right));
        list.add(new ChallengeDTO(R.drawable.small_10k,R.string.ch_w,R.string.ch_tv2_10,"3일 남음",R.drawable.ic_arrow_right));
        list.add(new ChallengeDTO(R.drawable.small_100k,R.string.ch_m_100,R.string.ch_tv2_100,"16일 남음",R.drawable.ic_arrow_right));
        list.add(new ChallengeDTO(R.drawable.small_25k,R.string.ch_m_25,R.string.ch_tv2_25,"16일 남음",R.drawable.ic_arrow_right));
        list.add(new ChallengeDTO(R.drawable.small_30k,R.string.ch_m_30,R.string.ch_tv2_30,"16일 남음",R.drawable.ic_arrow_right));


        ChallengeAdapter adapter = new ChallengeAdapter(getLayoutInflater(),list);
        recv.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recv.setLayoutManager(manager);
        return v;
    }
}
