package com.example.project_clone.plan;

public class PlanDTO {

    public PlanDTO(int plan_img, int tv1, int tv2, int btn1) {
        this.plan_img = plan_img;
        this.tv1 = tv1;
        this.tv2 = tv2;
        this.btn1 = btn1;
    }

    int plan_img, tv1, tv2, btn1;

    public int getPlan_img() {
        return plan_img;
    }

    public void setPlan_img(int plan_img) {
        this.plan_img = plan_img;
    }

    public int getTv1() {
        return tv1;
    }

    public void setTv1(int tv1) {
        this.tv1 = tv1;
    }

    public int getTv2() {
        return tv2;
    }

    public void setTv2(int tv2) {
        this.tv2 = tv2;
    }

    public int getBtn1() {
        return btn1;
    }

    public void setBtn1(int btn1) {
        this.btn1 = btn1;
    }
}