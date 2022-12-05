package com.example.project01_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.project01_clone.chat.ChatFragment;
import com.example.project01_clone.friendlist.FriendFragment;
import com.example.project01_clone.more.MoreFragment;
import com.example.project01_clone.shopping.ShoppingFragment;
import com.example.project01_clone.view.ViewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar; //1. 전역변수로 하나 만들고,
    //a.btm_nav가 바뀔때 프래그먼트 붙이기
    BottomNavigationView btm_nav;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        actionBar = getSupportActionBar(); //2. 기본으로 있는 액션바를 가져온다.
        //33글씨바꾸기
        actionBar.setTitle("친구");
        //처음에 friendfragment나오게하려면
        changeFragment(new FriendFragment());

        //b.
        btm_nav = findViewById(R.id.btm_nav);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.btm_item1){
                    actionBar.setTitle("친구");
                    //1. 패키지 추가 ->firendlsit
                    //2.FriendFragment 추가한뒤에
                    //3.클릭시 해당하는 프래그먼트가 붙게 처리한다.
                         getSupportFragmentManager().beginTransaction().replace(R.id.container, new FriendFragment()).commit();

                    //▣ 메소드 호출
                    // fragment를  파라미터로 입력받게 만들었다.    → 넘기려면 어떻게 해야할까?
                    /*   Fragment fragment = new Fragment();
                    changeFragment(fragment); -> 아무것도 안나옴*/

                    changeFragment(new FriendFragment());

                }else if (item.getItemId()== R.id.btm_item2){
                    actionBar.setTitle("채팅");

                }else if (item.getItemId() == R.id.btm_item3){
                    actionBar.setTitle("뷰");

                }else if (item.getItemId() == R.id.btm_item4){
                    actionBar.setTitle("쇼핑");


                }else if (item.getItemId() == R.id.btm_item5){
                    actionBar.setTitle("더보기");

                }

                return true; //선택을 취소함
            }
        });
    }//oncreate
    /*프래그먼트를 changeFragment라는 메소드를 이용해서 동적으로 붙이는 처리를 한다
    *,new FriendFragment() 가 바뀌면된다.
    * changeFragment라는 메소드를 친구목록 클릭했을때 호출해보기 -> 위에 ▣  */
    public  void changeFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

    }



}