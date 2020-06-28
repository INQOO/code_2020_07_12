package com.inqoo.classes.abstraction;

public class PhysicalWorker extends Employee {

    public PhysicalWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void lift50kg() {
        System.out.println("No problem!!!");
    }
}
