package com.example.temp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//public : 접근제한자
//extends : 상속 → 자식 클래스가 필요에 의해 부모 클래스를 선택한 것이다. (why? 부모클래스 안의 기능을 자식클래스가 쓰기위해서)
public class MainActivity extends AppCompatActivity {
    //MainActivity클래스는 AppCompatActivity의 자식클래스

    @Override //main메소드
    //Override & OverLoading 의 차이
        //Override : 재정의 (이미 구현되어있는 부모클래스 내용을 다시 정의해서 쓰는것)
        //OverLoading : 메소드의 이름을 같게하고 파라메터 타입이나 개수를 달리해서 사용하는 것
    protected void onCreate(Bundle savedInstanceState) {
        //protected : 상속을 받아야지만 재정의를 허용함.
        //onCreate() : 실행 메소드
        super.onCreate(savedInstanceState);
        //super.: 부모 필드 또는 메소드를 호출
        setContentView(R.layout.activity_main);
        //화면에 나타날 View를 지정한다.

     //MainActivity에서  전부 다 호출 사용하기.
        Test test = new Test(); //인스턴스화
            //멤버의 접근은 인스턴스화된 객체에서 . 찍으면 접근가능
        test.iMethod();
        test.num1 = 11;
        test.num2 = 14;

       // test.a = 'a' ; : static 변수
       //static은  메모리에 이미 올라가있는 변수이기 때문에 인스턴스화 된 객체에서 .으로 바로 불러온다.

       //ex2.
       Test.Sub test_1 = test.new Sub();//인스턴스멤버기때문에  인스턴스화 된 식으로  초기화 되어있어야 메모리 로딩가능
        test_1.subMethod(); //메소드 호출
        test_1.sub_v1 = "hello"; //변수에 값 입력

        //ex3.
        //static은 전체에서 접근 가능하다.
        Test.sSub.subMethod2();      //Test. 의 sSub 클래스에서 . subMethod2() 메소드를 불러온다
        Test.sSub.sub_v2 = 1;       // .sub_v2 변수에 값을 준다.

        //stataic 아닌 인스턴스 멤버의 접근은
        Test.sSub ss = new Test.sSub(); //  객체생성해서 해당 클래스에 접근 가능하도록
        ss.subMethod();
        ss.subV1 = "hi";











    }

}