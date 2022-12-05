package com.example.project01_clone.friendlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_clone.R;

import java.util.ArrayList;

//리사이zmf러뷰에 대표적으로 많이 사용되며, 외워야할 어댑터는 RecyclerView.Adapter 이다.

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder>{
    LayoutInflater inflater;



    ArrayList<FriendDTO> list ;
    ///대문자 타입은 --> new

    public FriendAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //                            칸마다 들어가는 레이아웃, Viewgroup,
        View v = inflater.inflate(R.layout.item_recv_friend,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.profile_img.setImageResource(list.get(i).getImgRes());
    h.name.setText(list.get(i).getName());
    h.msg.setText(list.get(i).getMsg());
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    //ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder  {
        ImageView profile_img;
        TextView name, msg;
        public ViewHolder(@NonNull View v) {

            //View 타입을 리턴
            super(v);

            profile_img = v.findViewById(R.id.profile_img);
            name = v.findViewById(R.id.name);
            msg = v.findViewById(R.id.msg);
        } //
    }//ViewHolder

}//class
