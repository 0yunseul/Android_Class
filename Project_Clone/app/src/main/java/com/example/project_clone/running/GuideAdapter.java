package com.example.project_clone.running;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;
import com.example.project_clone.plan.PlanAdapter;

import java.util.ArrayList;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<GuideDTO> list;

    public GuideAdapter(LayoutInflater inflater, ArrayList<GuideDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_guide,parent,false);
        GuideAdapter.ViewHolder viewHolder = new GuideAdapter.ViewHolder(v);
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.img.setImageResource(list.get(i).img);
        h.tv.setText(list.get(i).tv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView img;
            TextView tv;

            public ViewHolder(@NonNull View v) {
                super(v);
                img = v.findViewById(R.id.img);
                tv = v.findViewById(R.id.tv);
            }
        }


}
