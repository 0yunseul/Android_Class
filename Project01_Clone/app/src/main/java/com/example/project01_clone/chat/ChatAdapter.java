package com.example.project01_clone.chat;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_clone.R;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    LayoutInflater inflater;

    public ChatAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = inflater.inflate(R.layout.item_recv_chat,parent,false);
       ViewHolder viewHolder = new ViewHolder(v);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile_img;
        TextView tv_1,tv_2,tv_3;
        public ViewHolder(@NonNull View v) {
            super(v);
            profile_img = v.findViewById(R.id.profile_img);
            tv_1 = v.findViewById(R.id.tv_1);
            tv_2 = v.findViewById(R.id.tv_2);
            tv_3 = v.findViewById(R.id.tv_3);

        }
    }

}
