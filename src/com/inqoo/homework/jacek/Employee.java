package com.inqoo.homework.jacek;

import java.math.BigDecimal;

public class Employee {
    String name;
    int age;
    String position;
    public BigDecimal salary = new BigDecimal("3000");
    public static final double bonus = 1.2;
    public int addBonus =;


    public Employee(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {return name; }
    public int getAge() {return age;}
    public String getPosition() {return position;}
}

