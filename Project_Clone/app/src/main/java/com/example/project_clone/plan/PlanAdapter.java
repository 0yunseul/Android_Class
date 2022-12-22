package com.example.project_clone.plan;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;
import com.example.project_clone.home.UserProfileActivity;

import java.util.ArrayList;

public class PlanAdapter extends RecyclerView.Adapter<PlanAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<PlanDTO> list;
    Context context;

    public PlanAdapter(LayoutInflater inflater, ArrayList<PlanDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
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

    h.ln_plan.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, MarathonActivity.class);
            context.startActivity(intent);

        }
    });

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView plan_img;
    TextView tv1, tv2;
    Button btn1;
    LinearLayout ln_plan;
    public ViewHolder(@NonNull View v) {
        super(v);
        plan_img = v.findViewById(R.id.plan_img);
        tv1 = v.findViewById(R.id.tv1);
        tv2 = v.findViewById(R.id.tv2);
        btn1 = v.findViewById(R.id.btn1);
        ln_plan = v.findViewById(R.id.ln_plan);


            }

    }





}

