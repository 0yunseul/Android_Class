package com.example.project_clone.home;

import java.io.Serializable;

public class HomeDTO implements Serializable {
    private  int image_viewpager;

    public HomeDTO(int image_viewpager) {
        this.image_viewpager = image_viewpager;
    }

    public int getImage_viewpager() {
        return image_viewpager;
    }

    public void setImage_viewpager(int image_viewpager) {
        this.image_viewpager = image_viewpager;
    }
}
