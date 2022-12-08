package com.example.project01_clone.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_clone.R;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.Viewholder>{

LayoutInflater inflater;

    public ViewAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_recv_view,parent,false);
            Viewholder v = new Viewholder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 5;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        public Viewholder(@NonNull View v) {

            super(v);
        }
    }

}
