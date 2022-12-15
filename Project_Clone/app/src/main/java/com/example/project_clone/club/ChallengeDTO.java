package com.example.project_clone.club;

import java.io.Serializable;

public class ChallengeDTO {
    int img_ch_1, tv_ch_1, tv_ch_2, img_ch_2;
    String tv_ch_3;

    public int getImg_ch_1() {
        return img_ch_1;
    }

    public void setImg_ch_1(int img_ch_1) {
        this.img_ch_1 = img_ch_1;
    }

    public int getTv_ch_1() {
        return tv_ch_1;
    }

    public void setTv_ch_1(int tv_ch_1) {
        this.tv_ch_1 = tv_ch_1;
    }

    public int getTv_ch_2() {
        return tv_ch_2;
    }

    public void setTv_ch_2(int tv_ch_2) {
        this.tv_ch_2 = tv_ch_2;
    }

    public int getImg_ch_2() {
        return img_ch_2;
    }

    public void setImg_ch_2(int img_ch_2) {
        this.img_ch_2 = img_ch_2;
    }

    public String getTv_ch_3() {
        return tv_ch_3;
    }

    public void setTv_ch_3(String tv_ch_3) {
        this.tv_ch_3 = tv_ch_3;
    }

    public ChallengeDTO(int img_ch_1, int tv_ch_1, int tv_ch_2, String tv_ch_3, int img_ch_2) {
        this.img_ch_1 = img_ch_1;
        this.tv_ch_1 = tv_ch_1;
        this.tv_ch_2 = tv_ch_2;
        this.tv_ch_3 = tv_ch_3;
        this.img_ch_2 = img_ch_2;
    }




}