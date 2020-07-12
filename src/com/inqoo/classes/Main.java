package com.inqoo.classes;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("BMW", "3", 2010, 2.0, "blue");

        System.out.println("Mam nowy samochód: " + bmw.getBrand() + " " + bmw.getModel());
        System.out.println("Ma bardzo mocny silnik " + bmw.getEngine() + "L");

        System.out.println("Patrzcie jak trąbi: ");
        bmw.honk();
        bmw.honk();
        bmw.honk();

        System.out.println("No to jazda!");
        bmw.turnEngineOn();
        System.out.println(bmw.isEngineRunning());
        bmw.turnEngineOff();

    }
}
