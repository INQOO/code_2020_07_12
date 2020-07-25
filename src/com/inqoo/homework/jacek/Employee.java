package com.inqoo.homework.jacek;

import java.math.BigDecimal;

class Employee {
    private String name;
    private int age;
    private String position;
    private BigDecimal salary = new BigDecimal("3000");
    private static final double BONUS = 1.2;

    Employee(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    String getName() {
        return name;
    }

    int getAge() {

        return age;
    }

    String getPosition() {
        return position;
    }

    void increaseSalary(BigDecimal amount){
        salary = salary.add(amount);
    }

    void decreaseSalary(BigDecimal amount){
        salary = salary.subtract(amount);
    }

    void addBonus() {

        salary = new BigDecimal(BONUS).multiply(salary).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    }

    BigDecimal getSalary(){
        return salary;
    }

    public String toString(){
        return "Imie pracownika: " + name
                + ", lat: " + age
                + ", na stanowisku: " + position
                + ", otrzymał wynagrodzenie: " + salary;
    }
}

