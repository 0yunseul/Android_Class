package com.example.project01_clone.friendlist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_clone.R;

import java.util.ArrayList;

//리사이클러뷰에 대표적으로 많이 사용되며, 외워야할 어댑터는 RecyclerView.Adapter 이다.

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<FriendDTO> list ;
    ///대문자 타입은 --> new
    Context context;

    public FriendAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
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
    //아이템 클릭시 액티비티가 나올 수 있도록한다.
        // -> 액티비티 띄울때 꼭 필요한 것 (현재 화면의 정보 ) ==>  용어: Context
        //context는 일반 클래스에서 바로 접근 불가.  -> 화면에 나오는 클래스로부터 받아옴
        // 꼭 필요한 것 2  : 통신을 통해 액티비티를 띄우게 하는 객체 ==> 용어 :intent


        final int idx = i;

        h.profile_img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,DetailActivity.class);
            intent.putExtra("dto",list.get(idx));

            //오류발생원인: dto에서 implements Serializable 필요함
            //idx에 i 담는다
            context.startActivity(intent);

        }
    });



    }

    @Override
    public int getItemCount() {
        return 30;
    }

    //ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder  {
        ImageView profile_img ;
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
