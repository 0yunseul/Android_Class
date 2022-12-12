package com.example.and11_allview.carrot;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

import java.util.ArrayList;


public class C_Adapter extends RecyclerView.Adapter<C_Adapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<C_DTO> list;

    public C_Adapter(LayoutInflater inflater, ArrayList<C_DTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    /*1.ViewHolder만들기 */
public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imgv_title;
    TextView tv_title, tV_location, tv_money, tv_comments_cnt, tv_heart_cnt;
    Button btn_carrot_recycler;


        public ViewHolder(@NonNull View v) {
            super(v);

            imgv_title =v.findViewById(R.id.imgv_title);
          //  tv_title = v.findViewById(R.id.tv_title);
           // tV_location =
            //tv_money =
            //tv_comments_cnt =
            //tv_heart_cnt =
            //btn_carrot_recycler =
        }
    }

}
