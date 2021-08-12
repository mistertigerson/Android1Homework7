package com.example.android1homework7;

public class MainModel {

    private int img;
    private String dead;
    private String name;


    public MainModel(int img, String dead, String name, int img1, String dead1, String name1) {
        this.img = img;
        this.dead = dead;
        this.name = name;
    }


    public int getImg() {
        return img;
    }

    public String getDead() {
        return dead;
    }

    public String getName() {
        return name;
    }
}
