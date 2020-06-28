package com.inqoo.classes.inheritance;

public class Vehicle {

    int speed = 0;
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void go() {
        System.out.println("DRIVING");
    }

    public void stop() {
        System.out.println("STOPPING");
    }
}
