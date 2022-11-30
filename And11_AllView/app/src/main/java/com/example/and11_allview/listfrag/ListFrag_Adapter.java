package com.example.and11_allview.listfrag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class ListFrag_Adapter extends BaseAdapter {
    LayoutInflater inflater; //adapter는 layoutinflater  꼭 필요하다!
    ArrayList<ListFragDTO> list;

    //생성자가 필요 ----->


    public LayoutInflater getInflater() {
        return inflater;
    }

    public void setInflater(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    public ArrayList<ListFragDTO> getList() {
        return list;
    }

    public void setList(ArrayList<ListFragDTO> list) {
        this.list = list;
    }

    public ListFrag_Adapter(LayoutInflater inflater, ArrayList<ListFragDTO> list) {
        this.inflater = inflater;
        this.list = list;


    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        //레이아웃 붙이는 역할, *붙일 레이아웃을, 부모에게 붙이겠다, false는 무조건 false임
        v = inflater.inflate(R.layout.item_fragment_listv,parent,false);

        TextView tv_name = v.findViewById(R.id.tv_name);
        TextView tv_cnt = v.findViewById(R.id.tv_cnt);

        return v;
    }
}