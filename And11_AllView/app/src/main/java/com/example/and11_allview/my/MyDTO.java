package com.example.and11_allview.my;

public class MyDTO {
    public MyDTO(String title, String artist, int img, int rank) {
        this.title = title;
        this.artist = artist;
        this.img = img;
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    String title,artist;
int img, rank;
}