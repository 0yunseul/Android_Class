package com.example.project01_clone.chat;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_clone.R;
import com.example.project01_clone.friendlist.FriendAdapter;
import com.example.project01_clone.friendlist.FriendDTO;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<ChatDTO> list;
    Context context;

    public ChatAdapter(LayoutInflater inflater, ArrayList<ChatDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //내가  return을 하고 싶으면 해당하는 객체에 담을 수 있는 값 또는 해당하는 객체를 만들어서 return한다.

       View v = inflater.inflate(R.layout.item_recv_chat,parent,false);
        //item_recv_chat레이아웃을 붙이는 처리
        //ViewHolder viewHolder = new ViewHolder(뷰타입필요)
       ViewHolder viewHolder = new ViewHolder(v);
      //위 두줄 코드는  ViewHolder viewHolder1 = new ViewHolder(inflater.inflate(R.layout.item_recv_chat,parent,false);
       return viewHolder;
    }


    //Binding , Bind : 어떤 화면에 보이는 요소와 화면에 보이지 않는 데이터가 연결
    //바인딩하셨어요? -> db데이터랑  연결됨?
    //ViewHolder (데이터 한 칸을 저장해 놓은 DTO화면에 보이는 요소 ) : ArrayList의 데이터
    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
    h.profile_img.setImageResource(list.get(i).getProfile_img());
    h.tv_1.setText(list.get(i).getTv_1());
    h.tv_2.setText(list.get(i).getTv_2());
    h.tv_3.setText(list.get(i).getTv_3());

    final int idx = i;

    //한 칸에 있는 레이아웃 클릭시 어떤 처리를 할 것인지 설정.
        //채팅목록 화면 클릭시 화면을 전환->채팅 액티비티 띄우기
    h.lin_chat.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //화면 전환 -> 채팅 액티비티
            //화면 전환 : intent

            Intent intent = new Intent(context,ChatActivity.class);  //context는 필드에서 선언 필요, 생성자 또는 getter setter만들기
                                    //context는 두가지 있고, 지금 사용하는 건 activity context  지금위치에서 , 다른 액티비티 띄울것이다.

           // intent.putExtra("dto",list.get(idx));

            context.startActivity(intent);
            //여기서 시작하겠당
        }
    });



    }

    @Override
    public int getItemCount() {

        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile_img;
        TextView tv_1,tv_2,tv_3;
        LinearLayout lin_chat;

        public ViewHolder(@NonNull View v) {
            super(v);
            profile_img = v.findViewById(R.id.profile_img);
            tv_1 = v.findViewById(R.id.tv_1);
            tv_2 = v.findViewById(R.id.tv_2);
            tv_3 = v.findViewById(R.id.tv_3);
            lin_chat = v.findViewById(R.id.lin_chat);

        }
    }

}
