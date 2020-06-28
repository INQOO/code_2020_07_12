package com.inqoo.classes.inheritance;

public class MountainBike extends Bicycle {

    int gears;
    final String type = "Mountain";

    public MountainBike(String brand, int gears) {
        super(brand);
        this.gears = gears;
    }

    public int getNumberOfWheels() {
        return WHEELS;
    }
}
