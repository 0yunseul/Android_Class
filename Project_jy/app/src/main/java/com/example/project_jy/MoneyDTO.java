package com.example.project_jy;

import java.io.Serializable;

public class MoneyDTO implements Serializable {
    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
     public MoneyDTO(int money) {
         this.money = money;
     }
}
