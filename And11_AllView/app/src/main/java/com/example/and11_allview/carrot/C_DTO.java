package com.example.and11_allview.carrot;

public class C_DTO {
    int imgv_title,tv_heart_cnt,tv_comments_cnt ;
    String tv_title,tv_location,   tv_time,   tv_money  ;

    public C_DTO(int imgv_title, int tv_heart_cnt, int tv_comments_cnt, String tv_title, String tv_location, String tv_time, String tv_money) {
        this.imgv_title = imgv_title;
        this.tv_heart_cnt = tv_heart_cnt;
        this.tv_comments_cnt = tv_comments_cnt;
        this.tv_title = tv_title;
        this.tv_location = tv_location;
        this.tv_time = tv_time;
        this.tv_money = tv_money;
    }

    public int getImgv_title() {
        return imgv_title;
    }

    public void setImgv_title(int imgv_title) {
        this.imgv_title = imgv_title;
    }

    public int getTv_heart_cnt() {
        return tv_heart_cnt;
    }

    public void setTv_heart_cnt(int tv_heart_cnt) {
        this.tv_heart_cnt = tv_heart_cnt;
    }

    public int getTv_comments_cnt() {
        return tv_comments_cnt;
    }

    public void setTv_comments_cnt(int tv_comments_cnt) {
        this.tv_comments_cnt = tv_comments_cnt;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTv_location() {
        return tv_location;
    }

    public void setTv_location(String tv_location) {
        this.tv_location = tv_location;
    }

    public String getTv_time() {
        return tv_time;
    }

    public void setTv_time(String tv_time) {
        this.tv_time = tv_time;
    }

    public String getTv_money() {
        return tv_money;
    }

    public void setTv_money(String tv_money) {
        this.tv_money = tv_money;
    }
}
