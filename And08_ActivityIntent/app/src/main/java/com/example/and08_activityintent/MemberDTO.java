package com.example.and08_activityintent;
//Stream : 흐름 inputStream, outputStream (IO)
//직렬화 : 통신에서 전송을 편하게 하기위해 메모리 번지수를 직렬로 바꾸는 것
//Main에서 Intent-> Os ->Intent ->Sub 로 통신 .DTO전송시 Serializable 필수
//Intetnt통해서 DTO객체를 전송할때는 반드시 직렬화를 해야한다.

import java.io.Serializable;

public class MemberDTO implements Serializable {
    private String sVal1, sVal2, sVal3;

    public String getsVal1() {
        return sVal1;
    }

    public void setsVal1(String sVal1) {
        this.sVal1 = sVal1;
    }

    public String getsVal2() {
        return sVal2;
    }

    public void setsVal2(String sVal2) {
        this.sVal2 = sVal2;
    }

    public String getsVal3() {
        return sVal3;
    }

    public void setsVal3(String sVal3) {
        this.sVal3 = sVal3;
    }

    public MemberDTO(String sVal1, String sVal2, String sVal3) {
        this.sVal1 = sVal1;
        this.sVal2 = sVal2;
        this.sVal3 = sVal3;
    }
}
