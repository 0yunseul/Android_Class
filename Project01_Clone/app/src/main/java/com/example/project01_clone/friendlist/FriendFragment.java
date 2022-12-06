package com.example.project01_clone.friendlist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_clone.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.zip.Inflater;


public class FriendFragment extends Fragment {
    RecyclerView recv_friend_frag;
    Context context;
    ArrayList<FriendDTO> list = new ArrayList<>();


    int[] imgARR = {
            R.drawable.profile_img1,
            R.drawable.profile_img2,
            R.drawable.profile_img3,
            R.drawable.profile_img4,
            R.drawable.profile_img5,
            R.drawable.profile_img6,
            R.drawable.profile_img7,
            R.drawable.profile_img8
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_friend, container, false);

        //데이터를 반복문을 통해 30건을 넣는다.
        //이름 : 친구이름 + 번호, 상태메세지 : 상태 + 번호
        //단,이미지는 배열을 이용하여 , 랜덤하게 들어가게 처리를 해본다.


       // FriendDTO e = new FriendDTO(0,"이름","상메");
        for (int i = 0; i < 30; i++){
        //list.add(new FriendDTO(0,"이름"+(i+1),"상메"+(i+1)));
        //   → list.add(new FriendDTO(imgARR[1],"이름"+(i+1),"상메"+(i+1)));
            //마지막 랜덤이미지 처리 ↓
            list.add(new FriendDTO(imgARR[new Random().nextInt(imgARR.length)],"이름"+(i+1),"상메"+(i+1)));
        }

        recv_friend_frag = v.findViewById(R.id.recv_friend_frag);
        recv_friend_frag.setAdapter(new FriendAdapter(inflater,list,getContext()));
        recv_friend_frag.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        return v;

    }
}