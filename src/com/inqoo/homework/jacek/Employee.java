package com.inqoo.homework.jacek;

import java.math.BigDecimal;

public class Employee {
    public String name;
    public int age;
    public String position;
    public BigDecimal salary = new BigDecimal("3000");
    public static final double bonus = 1.2;

    public Employee(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void increaseSalary(BigDecimal amount){
        salary = salary.add(amount);
    }

    public void decreaseSalary(BigDecimal amount){
        salary = salary.subtract(amount);
    }

    public void addBonus() {
        salary = new BigDecimal(bonus).multiply(salary).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getSalary(){
        return salary;
    }

    public String toString(){
        return "Imie pracownika: " + name
                + ", lat: " + age
                + ", na stanowisku: " + position
                + ", otrzymał wynagrodzenie: " + salary;
    }
}

