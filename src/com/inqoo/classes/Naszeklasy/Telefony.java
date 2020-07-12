package com.inqoo.classes.Naszeklasy;



public class Telefony {
    private String brand;
    private String model;
    private double wielkośćEkranu;
    private String color;
    private boolean umnieDziala;

    public Telefony(String brand, String model, double wielkośćEkranu, String color, boolean umnieDziala) {
        this.brand = brand;
        this.model = model;
        this.wielkośćEkranu = wielkośćEkranu;
        this.color = color;
        this.umnieDziala = umnieDziala;
    }

    public static void main(String[] args) {
        Telefony mój = new Telefony(
                "Honor",
                "viev20",
                5.8,
                "niebieski",
                true);
        System.out.println(mój.brand);
    }

}


