package com.example.project01_clone.friendlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.project01_clone.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgv_detail_profile;
    TextView tv_name, tv_msg;
    LinearLayout ln_1, ln_2, ln_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide(); //액션바 가져와서 안보이게 처리

        ln_1 = findViewById(R.id.ln_1);
        ln_2 = findViewById(R.id.ln_2);
        ln_3 = findViewById(R.id.ln_3);

        ln_1.setOnClickListener(this);
        ln_2.setOnClickListener(this);
        ln_3.setOnClickListener(this);

        Intent intent = getIntent();

        FriendDTO dto = (FriendDTO) intent.getSerializableExtra("dto");

        imgv_detail_profile = findViewById(R.id.imgv_friend_profile);
        tv_name = findViewById(R.id.tv_name);
        tv_msg = findViewById(R.id.tv_msg);


        imgv_detail_profile.setImageResource(dto.getImgRes());
        tv_msg.setText(dto.getMsg());
        tv_name.setText(dto.getName());

    }
    @Override
    public void onClick(View v){
        //Intent :컴포넌트들간의 통신을 맡고있는 객체 (액티비티)
        //  1.명시적 인텐트 (우리가 만든 클래스 내부에서 사용하고, 그 통제가 전부 가능한 상태)
        //  예 : ( Intent intent  = new Intent (현재 위치 (Context), 다음 띄울 액티비티.class)
        //      startActivity로 끝남

        //  2.묵시적(암시적)인텐트 (우리가 만든게 아니고, os나 다른 기타 외부에서 제공하는 기능과 통신(호출))할 때 사용하는 인텐트
        //  인터넷 연결, 전화 연결, 카메라, 갤러리, 맵 등등 , 우리가 만든게 아니라 어떤 결과가 나올지 모름, 사용자가 어떤걸 동작을 할 지 다 컨트롤 할 수 없음
        Intent intent = null;

        if (v.getId() == R.id.ln_1){
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
                                    // 묵시적인텐트는 외우거나 하지 않아도 된다.
        }else if(v.getId() == R.id.ln_2){
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:01094729427"));

        }else if(v.getId() == R.id.ln_3){
            intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,"대한민국");


        }
        startActivity(intent);
    }


}