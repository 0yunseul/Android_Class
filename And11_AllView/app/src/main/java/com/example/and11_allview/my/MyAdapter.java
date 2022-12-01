package com.example.and11_allview.my;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

import org.w3c.dom.Text;

/*RecyclerView 상속받기*/
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>  {
    LayoutInflater inflater;
    //어댑터 연결처리를 위해 생성자를 만들기.
    public MyAdapter(LayoutInflater inflater) {

        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate((R.layout.item_fragment_my),parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    /*ViewHolder 이너클래스 생성*/
    //RecyclerView.ViewHolder 상속받은 ViewHolder  클래스를 만든다.
    public class ViewHolder extends RecyclerView.ViewHolder {
         ImageView img;
         TextView rank, title, artist;
         Button play;


        public ViewHolder(@NonNull View v) {
            super(v);
            /*위젯찾아오기*/
            img = v.findViewById(R.id.img);
            rank = v.findViewById(R.id.rank);
            title = v.findViewById(R.id.title);
            artist = v.findViewById(R.id.artist);
            play = v.findViewById(R.id.play);

        }
    }
}
