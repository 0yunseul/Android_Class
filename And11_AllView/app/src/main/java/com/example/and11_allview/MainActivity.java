package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.and11_allview.gridv.GridFragment;
import com.example.and11_allview.listfrag.ListFragment;
import com.example.and11_allview.my.MyFragment;
import com.example.and11_allview.recycler.RecyclerFragment;

public class MainActivity extends AppCompatActivity {
    /*버튼 초기화*/
    Button btn_sub, btn_listf, btn_grid, btn_recycler,btn_recycler_my;
    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sub = findViewById(R.id.btn_sub);
        btn_listf =findViewById(R.id.btn_listf);
        btn_grid = findViewById(R.id.btn_grid);
        btn_recycler = findViewById(R.id.btn_recycler);
        btn_recycler_my = findViewById(R.id.btn_recycler_my);

        /*Activity 리스트 뷰 버튼 클릭시 SubActivity 띄우기*/
        /*intent 객체 사용 / MainActivity.this !!*/
        /*startActivity(intent) ! */
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            startActivity(intent);

            }
        });

        /*listf버튼 클릭시*/
        btn_listf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*ListFragment(이름)가 container에 붙게*/
               getSupportFragmentManager().beginTransaction().replace(R.id.container, new ListFragment()).commit();

            }
        });

        /*grid버튼 클릭시*/
        btn_grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*GridFragment(이름)가 container에 붙게*/
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new GridFragment()).commit();
            }
        });

        /*recycler버튼 클릭시*/
        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new RecyclerFragment()).commit();
            }
        });

        /*btn_recycler_my버튼 클릭시*/
        btn_recycler_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new MyFragment()).commit();
            }
        });
    }

}