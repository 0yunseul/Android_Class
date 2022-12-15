package com.example.project_clone.club;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;

import java.util.ArrayList;

public class ChallengeAdapter extends RecyclerView.Adapter<ChallengeAdapter.ViewHolder>{

LayoutInflater inflater;

    public ChallengeAdapter(LayoutInflater inflater, ArrayList<ChallengeDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    ArrayList<ChallengeDTO> list;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_ch,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.img_ch_1.setImageResource(list.get(i).img_ch_1);
    h.img_ch_2.setImageResource(list.get(i).img_ch_2);
    h.tv_ch_1.setText(list.get(i).tv_ch_1);
    h.tv_ch_2.setText(list.get(i).tv_ch_2);
    h.tv_ch_3.setText(list.get(i).tv_ch_3);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_ch_1, img_ch_2;
        TextView tv_ch_1, tv_ch_2, tv_ch_3;

        public ViewHolder(@NonNull View v) {
            super(v);
            img_ch_1 = v.findViewById(R.id.img_ch_1);
            tv_ch_1 = v.findViewById(R.id.tv_ch_1);
            tv_ch_2 = v.findViewById(R.id.tv_ch_2);
            tv_ch_3 = v.findViewById(R.id.tv_ch_3);
            img_ch_2 = v.findViewById(R.id.img_ch_2);
        }
    }
}
