package com.example.android1homework7;

import java.io.Serializable;

public class MainModel implements Serializable {

    private int img;
    private String dead;
    private String name;


    public MainModel(int img, String dead, String name) {
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
