package com.inqoo.classes.abstraction;

public abstract class Employee {

    final String name;
    final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void lift50kg();
}
