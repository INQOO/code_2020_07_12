package com.inqoo.classes.abstraction;

public class OfficeWorker extends Employee {

    public OfficeWorker(String name, int age) {
        super(name, age);
    }

    @Override
    public void lift50kg() {
        System.out.println("I can't! :(");
    }
}
