package com.example.lastproject.customer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.conn.ApiClient;
import com.example.conn.CommonMethod;
import com.example.lastproject.R;
import com.example.lastproject.exam.ExamActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class CustomerActivity extends AppCompatActivity {
    RecyclerView recv_cus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        ApiClient.setBASEURL("http://192.168.0.45/middle/");
        recv_cus = findViewById(R.id.recv_cus);

        selectList();


        //스프링데이터 안드로이드로        //안드로이드 시작점에서 한번만 해주면 된다.


                /* new CommonMethod().sendPost("select.cu", new CommonMethod.CallBackResult() {
                    @Override
                    public void result(boolean isResult, String data) {
                        Log.d("로그", "onCreate: "+data);
                    }
                }); */
    }
    public void selectList(){
        new CommonMethod().sendPost("select.cu", ((isResult, data) -> {

            ArrayList<CustomerVO> list = new Gson().fromJson(data, new TypeToken<ArrayList<CustomerVO>>(){}.getType());

                //비동기 영역 (result는 최대 10초 후에 실행될 수 있음 )

            recv_cus.setAdapter(new cusAdapter(getLayoutInflater(),list,CustomerActivity.this));
            recv_cus.setLayoutManager(new LinearLayoutManager(CustomerActivity.this,RecyclerView.VERTICAL,false));

        }));
    }


    }








