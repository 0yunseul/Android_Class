package com.example.project01_clone.chat;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_clone.R;
import com.example.project01_clone.common.CommonMethod;
import com.example.project01_clone.friendlist.FriendAdapter;

import java.util.ArrayList;
import java.util.Random;


public class ChatFragment extends Fragment {
    RecyclerView recv_chat;

    Context context;

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

        /*채팅아이콘눌렀을때 채팅화면 뜨게하는것*/
        View v =  inflater.inflate(R.layout.fragment_chat, container, false);

     //이미지는 배열을 이용해서 랜덤하게,
        ArrayList<ChatDTO> list = new ArrayList<>();
        for (int i = 0; i < 22; i++) {
            list.add(new ChatDTO(imgARR[new Random().nextInt(imgARR.length)], "보낸사람", "보낸내용", "오전" + (i+1) + ":"+(i+10)));
        }



        recv_chat = v.findViewById(R.id.recv_chat);

       // ChatAdapter adapter = new ChatAdapter(inflater);
        // recv_chat.setAdapter(adapter); ->리사이클러뷰와 어댑터 연결

       //위를 아래와 같이 한 줄로 나타낼 수 있다.
       recv_chat.setAdapter(new ChatAdapter(inflater,list,getContext()));


        //recv_exam_chat.setLayoutManger(manager);
        //위 두줄을 아래와 같이 한 줄로 나타낼 수 있다.
        //recv_chat.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        //          common패키지파일에서 메소드로 생성해보기
        LinearLayoutManager manager = CommonMethod.getManager(getContext());
        recv_chat.setLayoutManager(manager);

        return v;
    }



}