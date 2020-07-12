package com.inqoo.Naszeklasy;

import org.w3c.dom.ls.LSOutput;

public class Hulajnoga {

    public String color;
    String model;
    String brand;
    int year;
    boolean czyJezdzi;

    public Hulajnoga(String model, String brand, int year, String color, boolean czyJezdzi) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.czyJezdzi = czyJezdzi;
    }

}
