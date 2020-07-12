package com.inqoo.classes.naszeklasy;

public class Smart {
    public String brand;
    public String model;
    public int year;
    public String color;

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
