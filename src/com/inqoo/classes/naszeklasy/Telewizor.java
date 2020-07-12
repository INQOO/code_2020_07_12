package com.inqoo.classes.naszeklasy;

public class Telewizor {

    public String marka;
    public String kolor;
    public int rozdzielczosc;

    public Telewizor(String marka, String kolor, int rozdzielczosc) {
        this.marka = marka;
        this.kolor = kolor;
        this.rozdzielczosc = rozdzielczosc; }

    public static void main(String[] args) {

        Telewizor panasonic = new Telewizor("Panasonic", "szary", 40);
        Telewizor lg = new Telewizor("LG", "czarny", 52);

        System.out.println(panasonic);
        System.out.println(lg);
    }
    }







