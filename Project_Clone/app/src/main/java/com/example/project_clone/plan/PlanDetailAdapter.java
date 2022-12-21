package com.example.project_clone.plan;

import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanDetailAdapter {
    LayoutInflater inflater;

    public PlanDetailAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        public Viewholder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
