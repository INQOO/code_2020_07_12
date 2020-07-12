package com.inqoo.classes;

public class Car {

    String brand; // marka
    String model; // model

    private int year;     // rok produkcji
    private double engine; // pojemność silnika w litrach
    private String color; // kolor

    private boolean engineRunning; // czy silnik jest włączony

    public void turnEngineOn() {
        this.engineRunning = true;
        System.out.println("Silnik włączony!");
    }

    public void turnEngineOff() {
        this.engineRunning = false;
        System.out.println("Silnik wyłączony!");
    }

    public void honk() {
        System.out.println("BEEEEEEEEEP");
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

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngine(float engine) {
        if (engine > 100) {
            throw new RuntimeException("Nie ma aż tak dużych silników!");
        }
        this.engine = engine;
    }

    public void setColor(String color) {
        if ("pink".equalsIgnoreCase(color)) {
            System.out.println("Różowy samochód? No dobra, niech Ci będzie...");
        }
        this.color = color;
    }
}
