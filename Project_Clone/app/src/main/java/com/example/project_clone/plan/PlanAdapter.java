package com.example.project_clone.plan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;

import java.util.ArrayList;

public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<PlanDTO> list;

    public PlanAdapter(LayoutInflater inflater, ArrayList<PlanDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_plan,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.plan_img.setImageResource(list.get(i).plan_img);
    h.tv1.setText(list.get(i).tv1);
    h.tv2.setText(list.get(i).tv2);
    h.btn1.setText(list.get(i).btn1);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView plan_img;
    TextView tv1, tv2;
    Button btn1;
    public ViewHolder(@NonNull View v) {
        super(v);
        plan_img = v.findViewById(R.id.plan_img);
        tv1 = v.findViewById(R.id.tv1);
        tv2 = v.findViewById(R.id.tv2);
        btn1 = v.findViewById(R.id.btn1);
    }
}
}
