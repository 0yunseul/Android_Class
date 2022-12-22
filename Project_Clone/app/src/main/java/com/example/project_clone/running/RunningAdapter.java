package com.example.project_clone.running;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_clone.R;

import java.util.ArrayList;

public class RunningAdapter extends RecyclerView.Adapter<RunningAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<RunDTO> list;

    public RunningAdapter(LayoutInflater inflater, ArrayList<RunDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_recv_runningall,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.img_1.setImageResource(list.get(i).img);
        h.tv_1.setText(list.get(i).tv_1);
        h.tv_2.setText(list.get(i).tv_2);
        h.tv_3.setText(list.get(i).tv_3);
    }
    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img_1;
        TextView tv_1,tv_2,tv_3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_1 = itemView.findViewById(R.id.img_1);
            tv_1 = itemView.findViewById(R.id.tv_1);
            tv_2 = itemView.findViewById(R.id.tv_2);
            tv_3 = itemView.findViewById(R.id.tv_3);

        }
    }
}
