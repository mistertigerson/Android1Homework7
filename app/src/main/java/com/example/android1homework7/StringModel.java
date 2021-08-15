package com.example.android1homework7;

import java.io.Serializable;

public class StringModel implements Serializable {
    private String nameOfPlanet, numberOfPlanet;

    public StringModel(String nameOfPlanet, String numberOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
        this.numberOfPlanet = numberOfPlanet;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public String getNumberOfPlanet() {
        return numberOfPlanet;
    }
}
