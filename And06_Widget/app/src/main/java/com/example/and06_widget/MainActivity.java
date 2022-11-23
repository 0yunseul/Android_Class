package com.example.and06_widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   Button btn1, btn_login;
   TextView text1;
   RadioButton radio_1, radio_2;
   RadioGroup rdo_group;
   EditText edt_id, edt_pw;


    //6. edt_pw에 입력 된 값이 숫자인지를 판단해서 해당하는 숫자를 리턴하는 메소드만들기
    //패스워드에는 반드시 숫자값만 입력이되게 만들어보기. 숫자 외에 값은 전부 오류로 본다

        //edt_pw에 입력된 값이 int 인지 판단해서 해당하는 int를 return하는 메소드. 단 입력값이 숫자가 아닌 경우에는 -1을 return한다.

        int method() {
            //edt_pw.getText() //값이 숫자인지 아닌지 판단 : Wrapper Class 를 이용해서 해당하는 타입으로 바꿀수 있는지의 여부
            //Wrapper class 사용해서 숫자형태로 바꾸기 ==>Integer.parseInt(edt_pw.getText().toString());
           // Log.d("로그", "method: "+  Integer.parseInt(edt_pw.getText().toString()));

        //테스트 케이스 1: 숫자만 입력하고 로그인 버튼 눌러보기 ex)1234 ->오류 발생안함
        //테스트 케이스 2: 숫자와 문자를 혼합해서 입력하고 로그인 버튼 눌러보기 ex)1234a ->오류발생함
        //테스트 케이스에서 오류가 발생하는 부분을 오류가 안나게 메소드 수정
            //오류 발생 이유 : 숫자로 바꿀수 없으므로 (int+문자) 
            //해결 방법 :
            try {
                Log.d("로그", "method: "+  Integer.parseInt(edt_pw.getText().toString()));
            }catch (Exception e){
                Log.d("로그", "숫자로 바꿀 수 없습니다");
            }
        return -1;
         } /*method()*/

    //7. String값이 입력되었을때 숫자가 아니라면 return String을 하는 메소드
    //   숫자라면 String error를 리턴하세요.

    String rtn_str() { //id에 숫자값을 쓸 수 없도록 만든 메소드
        try {//id가 숫자인지 아닌지 판별해야함
            Integer.parseInt(edt_id.getText().toString());  // 문자열을 숫자로 바꿀수 없어서 오류가 발생함.
            Log.d("로그", "문자열을 입력해주세요");
            return "error";
        }catch (Exception e){
           return edt_id.getText()+"";
    }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn1 = findViewById(R.id.btn1);
            text1 = findViewById(R.id.text1);
            radio_1 = findViewById(R.id.radio_1);
            radio_2 = findViewById(R.id.radio_2);
            rdo_group = findViewById(R.id.rdo_group);
            edt_id = findViewById(R.id.edt_id);
            edt_pw = findViewById(R.id.edt_pw);
            btn_login = findViewById(R.id.btn_login);


//5. edt_id에 현재 입력 된 값을 가져오는 메소드는 edt_id.getText()
// btn_login이 클릭이 되면 edt_id의값이 admin 이고 edt_pw의 값이 1234 일때 로그인이 되게 처리해보기.
// 로그인==> 로그에 로그인이 되었습니다.
// 그외에는 아이디 또는 비밀번호를 확인해주세요.

   btn_login.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           method();
           rtn_str();
           if(edt_id.getText().toString().equals("admin") && edt_pw.getText().toString().equals("1234")){
               Log.d("로그인", "로그에 로그인이 되었습니다.");
         }else {
               Log.d("로그인 실패", "아이디 또는 비밀번호를 확인해주세요.");
           }
       }
   });







//4.아주 나쁨 ~~~~아주 좋음 까지 선택 된 라디오버튼의 값을 로그에 찍어보기.
// 디버깅 모드를 활용해서 문제를 해결 해보기.
// 어떤 라디오버튼이 클릭 되었는지 알수있으려면 어떻게 해아할까???
        rdo_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("로그", ""+group.getCheckedRadioButtonId());
          /*      if(checkedId ==1){
                    Log.d("로그", "아주나쁨");
                }else if(checkedId ==2){
                    Log.d("로그", "나쁨");
                }else if(checkedId ==3){
                    Log.d("로그", "보통"); ....
                }*/
               RadioButton temp_rdo = (RadioButton) group.getChildAt(checkedId-1);
                Log.d("로그", "onCheckedChanged: "+temp_rdo.getText());
            }
        });



       // 1.    btn1 클릭시 텍스트 글씨 바뀌게  && text1 클릭시 버튼 글씨 바뀌게
       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("버튼클릭, 텍스트 바뀜!");
                }
        });

        text1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                btn1.setText("반대로 실행되게");
            }
        });


  //  2.    라디오 버튼 중 하나만 선택되게한다
        radio_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
               /* radio_2.setChecked(!isChecked); false와 같음*/
                radio_2.setChecked(false);

            }
            }
        });

        radio_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*isChecked : 라디오버튼 체크된 상태를 우리한테 넘겨줌, 체크가 되었다면 radio_1체크를 상태를 해제하고 싶다. */
                if(isChecked){
                    radio_1.setChecked(!isChecked);
                }
            }
        });


        /*3. implements로 View.OnClickListener 상속받은경우 */
        btn1.setOnClickListener(this);
        text1.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()  == R.id.btn1){
            text1.setText("텍스트");
        }else if(v.getId() == R.id.text1){
            btn1.setText("버튼");
        }

    }
}