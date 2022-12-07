package com.example.project01_clone.common;


import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CommonMethod {
    //이건 뭐지..?
    // -> 화면에서 매번 LayoutManger만드는 행위가 불편하므로, 재사용 가능한 메소드 하나를 이용해서 코드를 줄이고자 함.
    //LayoutManger리턴하는 메소드를 CommonMethod에서 정의하고, ChatExamFragment에서 사용해보기 .
    //RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);

    //recv_exam_chat.setLayoutManager(CommonMethod.getManager());
    public static LinearLayoutManager getManager(Context context){ //context를 화면에 보이는 객체로부터 받아온다. (getContext() 오류 해결)
        LinearLayoutManager manager = new LinearLayoutManager(context,RecyclerView.VERTICAL,false);
        return  manager;
    }

    public static LinearLayoutManager getManager(Context context,int orientation){ //context를 화면에 보이는 객체로부터 받아온다. (getContext() 오류 해결)
        LinearLayoutManager manager = new LinearLayoutManager(context,orientation,false);


        return  manager;
    }



}
