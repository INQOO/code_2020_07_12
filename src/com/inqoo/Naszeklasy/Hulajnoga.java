package com.inqoo.Naszeklasy;

import org.w3c.dom.ls.LSOutput;

public class Hulajnoga {

    String model;
    String brand;
    private int year;
    private String color;
    boolean Czyjezdzi;

    public Hulajnoga(String model, String brand, int year, String color, boolean czyjezdzi) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        Czyjezdzi = czyjezdzi;
    }

    public static void main(String[] args) {
        Hulajnoga Karolina = new Hulajnoga("Pro",
                "Xiaomi",
                2020,
                "red",
                false);
        System.out.println("Mam nową " + Karolina.brand + " w kolorze " + Karolina.color);


    }

}
