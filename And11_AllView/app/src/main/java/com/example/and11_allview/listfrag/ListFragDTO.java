package com.example.and11_allview.listfrag;

public class ListFragDTO {
    String name;
    int sec;

    public ListFragDTO(String name, int sec) {
        this.name = name;
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
}
