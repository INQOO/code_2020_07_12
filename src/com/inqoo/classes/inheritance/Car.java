package com.inqoo.classes.inheritance;

public class Car extends Vehicle {

    static final int WHEELS = 4;

    String engine;

    public Car(String brand, String engine) {
        super(brand);
        this.engine = engine;
    }

    public void honk() {
        System.out.println("BEEP");
    }

    public void showSpeed() {
        System.out.println("Current speed: " + speed);
    }
}
