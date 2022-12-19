package com.example.project_clone.running;

public class GuideDTO {
    int img;
    String tv;

    public GuideDTO(int img, String tv) {
        this.img = img;
        this.tv = tv;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}
