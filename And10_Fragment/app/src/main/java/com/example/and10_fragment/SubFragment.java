package com.example.and10_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;


public class SubFragment extends Fragment {
    Button btn_sub_frag;
    ImageView img1,img2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          View v = inflater.inflate(R.layout.fragment_sub, container, false);


          btn_sub_frag = v.findViewById(R.id.btn_sub_frag);
          img1 = v.findViewById(R.id.img1);
          img2 = v.findViewById(R.id.img2);
        //SubFragment 버튼 클릭 시 이미지 뷰_이미지 바뀌게 처리한다. (visibility 속성값 gone줘서 안보이게해놓고)
        btn_sub_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //루프 만든다. - 일정 범위 내에서 int값이 증가하는 것 0->1->0->1...
                //or 이미지 뷰 자체를 이용해서 보이는 상태에 따라 분기 (이미지뷰2개일대 편함)
               if (img1.getVisibility() == View.VISIBLE) {
                   img1.setVisibility(View.GONE); //안보이게 처리할 것
                   img2.setVisibility(View.VISIBLE);//보이게 처리할 것이다.
               }else if (img2.getVisibility() == View.VISIBLE) {
                   //img2의 visibility 속성이 visible인 경우
                   img2.setVisibility(View.GONE);
                   img1.setVisibility(View.VISIBLE);
               }


            }
        });
        return v;
    }
}