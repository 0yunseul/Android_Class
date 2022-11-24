package com.example.and08_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout ln_layout1;
    LinearLayout ln_layout2;
    Button btn_new;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //레이아웃 인플레이션 : xml에 있는 내용이 메모리에 올라가는 부분

        ln_layout1 = findViewById(R.id.ln_layout1);
        ln_layout2 = findViewById(R.id.ln_layout2);
        btn_new = findViewById(R.id.btn_new);

        LayoutInflater inflater = getLayoutInflater(); //레이아웃을 붙이는 기능을 가진 객체를 준다.

       View v1=inflater.inflate(R.layout.layout_sub1, ln_layout1, true);
       //xml에 있는 내용이 메모리에 올라감. 그 뒤 메모리에 올라간 모든 내용을 다시 return
        View v2=inflater.inflate(R.layout.layout_sub2, ln_layout2, true);
        

        //레이아웃을 붙이는 처리를 하면 (==레이아웃 인플레이션) 붙은 레이아웃이 메모리에 올라가면서
        //레이아웃의 모든 내용을 View 타입으로 return을 해준다.
        //return해준 View타입을 활용해서 위젯을 찾거나 하는 작업을 한다.

                //v2에 있는 버튼을 클릭하면 v2의 텍스트가 바뀌게 처리
                Button btn_sub2 = v2.findViewById(R.id.btn_sub2);
                TextView tv_sub2 = v2.findViewById(R.id.tv_sub2);

                btn_sub2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv_sub2.setText("v2 텍스트 바뀜");
                        Toast.makeText(MainActivity.this, "토스트..", Toast.LENGTH_SHORT).show();
        //NoneContext의 method1과 showToast 메소드를 호출하기
                        //method1과 shoToast는  NoneContext의 멤버변수.
                        //새로 객체를 생성 ->
                        NoneContext nc = new NoneContext(getLayoutInflater());

                        nc.method1();
                        nc.showToast(MainActivity.this);
                        nc.v1Setting(v1);
                        //v1은   MainActivity의 View v1

                    }
                });
        //Context: 현재 화면에 떠있는 객체에게 어떤 기능들을 사용할 수 있는 권한을 줌
        //           Activity를 넘겨주면 된다.
        Toast.makeText(this, "토스트..", Toast.LENGTH_SHORT).show();//this:mainActivity

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MainActivity에서 intent라는 객체를 통해 SubActivity1 띄우기
                Intent intent = new Intent(MainActivity.this,SubActivity2.class); //현재 activity명시, 다음 activity class명시
                startActivity(intent); //startActivity : AppCompatActivity를 상속받은 액티비티만 사용 가능하다.


            }
        });
    }

}