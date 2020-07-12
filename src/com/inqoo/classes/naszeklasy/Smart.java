package com.inqoo.classes.naszeklasy;

public class Smart {
    private String brand;
    private String model;
    private int year;
    private String color;

    public Smart (String brand, String model, int year, String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;

    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() { return color; }



}
