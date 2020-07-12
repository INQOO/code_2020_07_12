package com.inqoo.classes;


import com.inqoo.classes.naszeklasy.Monitor;

public class Main2 {
    public static void main(String[] args) {

        Car twingo = new Car(
                "Renault",
                "Twingo",
                false,
                2020,
                5.0,
                "Pink");

        Car opelAgila = new Car();

        Monitor samsung = new Monitor("Samsung", "4k", 24, "AMOLED");

        System.out.println(samsung);





    }
}