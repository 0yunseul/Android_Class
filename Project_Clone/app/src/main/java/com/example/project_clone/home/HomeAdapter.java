package com.example.project_clone.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project_clone.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{


     LayoutInflater inflater;
     Context context;
     int sliderImage;
     ArrayList<HomeDTO> list;

    public HomeAdapter(LayoutInflater inflater, Context context, int sliderImage, ArrayList<HomeDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.sliderImage = sliderImage;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View v = inflater.inflate(R.layout.item_viewpager,parent,false);
     ViewHolder viewHolder = new ViewHolder(v);
     return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int i = 0;
        holder.mImageView.setImageResource(list.get(i).getImage_viewpager());
    }

    @Override
    public int getItemCount() {
        return 6;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageSlider);
        }
        public void bindSliderImage(String imageURL){
            Glide.with(context).load(imageURL).into(mImageView);
        }
    }
}
