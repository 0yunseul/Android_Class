package com.example.lastproject.customer;

import android.app.AlertDialog;
import android.app.Dialog;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conn.CommonMethod;
import com.example.lastproject.R;

import java.util.ArrayList;

public class cusAdapter extends RecyclerView.Adapter<cusAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<CustomerVO> list;
    CustomerActivity activity;


    public cusAdapter(LayoutInflater inflater, ArrayList<CustomerVO> list, CustomerActivity activity) {
        this.inflater = inflater;
        this.list = list;
        this.activity = activity;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return new ViewHolder(inflater.inflate(R.layout.item_recv_cus,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.tv_id.setText(h.tv_id.getText()+":"+list.get(i).getId());
        h.tv_name.setText(h.tv_name.getText()+":"+list.get(i).getId());
        h.btn_delete.setOnClickListener(v -> {
               checkDelete(Integer.parseInt(list.get(i).getId()));
            });
        h.btn_detail.setOnClickListener(v -> {
            //customdialog
            Dialog dialog = new Dialog(activity);
            dialog.setContentView(R.layout.dialog_detail_cus);

            DisplayMetrics metrics = activity.getResources().getDisplayMetrics();
            int device_width = metrics.widthPixels;
            int device_height = metrics.heightPixels;

            dialog.getWindow().setLayout(device_width,device_height);

            TextView id= dialog.findViewById(R.id.id);
            TextView name = dialog.findViewById(R.id.name);
            TextView email = dialog.findViewById(R.id.email);
            TextView gender= dialog.findViewById(R.id.gender);
            TextView phone = dialog.findViewById(R.id.phone);


            id.setText("아이디:"+list.get(i).getId()+"");
            name.setText("이름:"+list.get(i).getName()+"");
            email.setText("이메일:"+list.get(i).getEmail()+"");
            gender.setText("성별:"+list.get(i).getGender()+"");
            phone.setText("핸드폰번호:"+list.get(i).getPhone()+"");



            dialog.show();
            //dialog.dismiss();

        });

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_id, tv_name;
        Button btn_detail, btn_edit, btn_delete;

        public ViewHolder(@NonNull View v) {
            super(v);
                tv_id= v.findViewById(R.id.tv_id);
                tv_name = v.findViewById(R.id.tv_name);
                btn_detail = v.findViewById(R.id.detail);
                btn_edit = v.findViewById(R.id.edit);
                btn_delete = v.findViewById(R.id.delete);


        }



    }

    public  void checkDelete(int id ){//여기서 네를 누르면 바로 삭제 처리, 아니오를 누르면 아무 처리도 하지 않는다.
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("고객 정보 삭제").setMessage("정말로 삭제하시겠습니까?").setIcon(R.drawable.ic_launcher_background);
        builder.setPositiveButton("네",((dialog, which) -> {
            //네 누르면 실행된다.
            new CommonMethod().setParams("id",id).sendPost("delete.cu",((isResult, data) -> {
                Log.d("로그", "onBindViewHolder: "+ data);
                activity.selectList();
            }));
        }));
        builder.setNegativeButton("아니오",((dialog, which) -> {
            //아니오 누르면 실행됨됨
        }));

        builder.create().show();
    }
}

