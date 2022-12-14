package com.example.project_clone.club;

import java.io.Serializable;

public class ChallengeDTO implements Serializable {
    private int imgRes;
    private String ch1,ch2,ch3;

    public ChallengeDTO(int imgRes, String ch1, String ch2, String ch3) {
        this.imgRes = imgRes;
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String getCh1() {
        return ch1;
    }

    public void setCh1(String ch1) {
        this.ch1 = ch1;
    }

    public String getCh2() {
        return ch2;
    }

    public void setCh2(String ch2) {
        this.ch2 = ch2;
    }

    public String getCh3() {
        return ch3;
    }

    public void setCh3(String ch3) {
        this.ch3 = ch3;
    }
}
