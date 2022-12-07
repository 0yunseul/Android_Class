package com.example.project_jy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    TextView tv_p1_name, tv_p2_name, tv_p3_name, tv_p4_name,
            tv_p1_price, tv_p2_price, tv_p3_price, tv_p4_price,
            tv_p1_qty, tv_p2_qty, tv_p3_qty, tv_p4_qty, tv_r_money;
    ProductDTO p_dto;
    MoneyDTO m_dto;
    ArrayList<ProductDTO> list;
    EditText et_insert;
    Button btn_order_p1, btn_order_p2, btn_order_p3, btn_order_p4,
            btn_insert, btn_return;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_dto = new MoneyDTO(0);
        list = new ArrayList<>();

        // 아이디 값 가져와서 초기화

        tv_p1_name =findViewById(R.id.tv_p1_name);
        tv_p2_name =findViewById(R.id.tv_p2_name);
        tv_p3_name =findViewById(R.id.tv_p3_name);
        tv_p4_name =findViewById(R.id.tv_p4_name);
        tv_p1_price =findViewById(R.id.tv_p1_price);
        tv_p2_price =findViewById(R.id.tv_p2_price);
        tv_p3_price =findViewById(R.id.tv_p3_price);
        tv_p4_price =findViewById(R.id.tv_p4_price);
        tv_p1_qty = findViewById(R.id.tv_p1_qty);
        tv_p2_qty = findViewById(R.id.tv_p2_qty);
        tv_p3_qty = findViewById(R.id.tv_p3_qty);
        tv_p4_qty = findViewById(R.id.tv_p4_qty);
        tv_r_money = findViewById(R.id.tv_r_money);
        et_insert = findViewById(R.id.et_insert);
        btn_order_p1 = findViewById(R.id.btn_order_1);
        btn_order_p2 = findViewById(R.id.btn_order_2);
        btn_order_p3 = findViewById(R.id.btn_order_3);
        btn_order_p4 = findViewById(R.id.btn_order_4);

        btn_insert = findViewById(R.id.btn_insert);
        btn_return = findViewById(R.id.btn_return);
        //list에 음료목록 담기
        list.add(new ProductDTO(tv_p1_name.getText().toString(), Integer.parseInt(tv_p1_price.getText().toString()), Integer.parseInt(tv_p1_qty.getText().toString())));
        list.add(new ProductDTO(tv_p2_name.getText().toString(), Integer.parseInt(tv_p2_price.getText().toString()), Integer.parseInt(tv_p2_qty.getText().toString())));
        list.add(new ProductDTO(tv_p3_name.getText().toString(), Integer.parseInt(tv_p3_price.getText().toString()), Integer.parseInt(tv_p3_qty.getText().toString())));
        list.add(new ProductDTO(tv_p4_name.getText().toString(), Integer.parseInt(tv_p4_price.getText().toString()), Integer.parseInt(tv_p4_qty.getText().toString())));
        //금액입력버튼 클릭시 하단에 잔액이 보여지는 메소드를 호출한다.
        btn_insert.setOnClickListener(this);
    }





    //버튼을 눌렀을때 실행되는 메소드
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_insert) {
            int money = m_dto.getMoney();
            Log.d("TAG", "onClick: " + money);
            int insert = Integer.valueOf(et_insert.getText().toString()); //et_insert를 정수만 입력가능하도록 형변환을함.
            Log.d("TAG", "onClick: " + insert);
            m_dto.setMoney(money + insert);
            Log.d("TAG", "onClick: " + m_dto.getMoney());
            tv_r_money.setText("잔액" + m_dto.getMoney() + "원"); //setText - 버튼 클릭시 바뀌는 내용
        }else if (v.getId() == R.id.btn_return) {
        }//주문하기 버튼1을 누르면  qty-1  이 되고 . qty ==0 "주문 불가" // m_dto.getMoney()-price 이고,  m_dto.getMoney()-price  < 0 "잔액부족!"  되어야한다.
        else if(v.getId() ==R.id.btn_order_1){
            //list.get(0).getQty(); //list에 상품을담았고, index 0번에 있는 상품의 현재수량을 가져옴; ->int  qty로 담음
            int qty = list.get(0).getQty();

            int price = list.get(0).getPrice();
            int money = m_dto.getMoney()-price;
            if(qty==0) { //현재수량이 0인경우에 주문 불가
                Toast.makeText(this, "주문불가!", Toast.LENGTH_SHORT).show();
            }else if (money<0){
                Toast.makeText(this,"잔액부족",Toast.LENGTH_SHORT).show(); //잔액이 0보다 작을때 잔액부족
            }else{m_dto.setMoney(m_dto.getMoney() - list.get(0).getPrice());
                list.get(1).setQty(list.get(1).getQty()-1);
                tv_p2_qty.setText(""+list.get(1).getQty());
                tv_r_money.setText(""+m_dto.getMoney());

            }
        }else if (v.getId() == R.id.btn_order_3) {
            if(list.get(2).getQty()==0) {
                Toast.makeText(MainActivity.this, "현재 품절 상품입니다.", Toast.LENGTH_SHORT).show();
            }else if(list.get(2).getPrice() > m_dto.getMoney()){
                Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }else{
                m_dto.setMoney(m_dto.getMoney() - list.get(2).getPrice());
                list.get(2).setQty(list.get(2).getQty()-1);
                tv_p3_qty.setText(""+list.get(2).getQty());
                tv_r_money.setText(""+m_dto.getMoney());
            }
        }else if (v.getId() == R.id.btn_order_4){
            if(list.get(3).getQty()==0) {
                Toast.makeText(MainActivity.this, "현재 품절 상품입니다.", Toast.LENGTH_SHORT).show();
            }else if(list.get(3).getPrice() > m_dto.getMoney()){
                Toast.makeText(MainActivity.this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }else{
                m_dto.setMoney(m_dto.getMoney() - list.get(3).getPrice());
                list.get(3).setQty(list.get(3).getQty()-1);
                tv_p4_qty.setText(""+list.get(3).getQty());
                tv_r_money.setText(""+m_dto.getMoney());
            }


        }//잔돈반환버튼 클릭시 ->인텐트 적용하여 Result Activity에서 보여준다.
        else if (v.getId() == R.id.btn_return){
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("m_dto",  m_dto.getMoney());
            // intent.putExtra("p_dto","주문한 음료 목록" +)
            startActivity(intent);
        }

    }





}