package com.example.and11_allview.listfrag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class ListFrag_Adapter extends BaseAdapter {
    LayoutInflater inflater;
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
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.item_fragment_listv,parent,false);
        return v;
    }
}