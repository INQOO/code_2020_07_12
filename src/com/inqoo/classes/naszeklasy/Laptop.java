package com.inqoo.classes.naszeklasy;

public class Laptop {
    private String brand; //marka
    private int rdzenie; //liczba rzedni w procesorze
    public boolean bluetooth; //czy posiada bluetooth
    double RAM; //ilość RAM

    public Laptop(String brand, int rdzenie, boolean bluetooth, double RAM) {
        this.brand = brand;
        this.rdzenie = rdzenie;
        this.bluetooth = bluetooth;
        this.RAM = RAM;
    }
}

