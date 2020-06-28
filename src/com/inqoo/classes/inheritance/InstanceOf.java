package com.inqoo.classes.inheritance;

public class InstanceOf {

    public static void main(String[] args) {
        // Object?
        Vehicle mountainBike = new MountainBike("Kross", 21);
        System.out.println(mountainBike instanceof Vehicle);
        System.out.println(mountainBike instanceof Car);
    }
}
