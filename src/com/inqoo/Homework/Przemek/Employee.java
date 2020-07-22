package com.inqoo.Homework.Przemek;

import java.math.BigDecimal;

public class Employee {
    private String name;
    int age;
    BigDecimal salary = new BigDecimal(3000);
    public static final BigDecimal bonus = BigDecimal.valueOf(1.2);


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public BigDecimal increaseSalary(BigDecimal amount) {
        salary = this.salary.add(amount);
        System.out.println(name + " Wypłata po zwiększeniu: " + salary);
        return salary;
    }

    public BigDecimal decreaseSalary(BigDecimal amount) {
        salary = this.salary.subtract(amount);
        System.out.println(name + " Wypłata po obniżeniu: " + salary);
        return salary;

    }

    public BigDecimal addBonus(boolean amount) {
        salary = this.salary.multiply(bonus);
        System.out.println(name + " Wypłata po bonusie: " + salary);
        return salary;
    }

    public BigDecimal getSalary() {
        System.out.println(name + " Wypłata równa się: " + salary);
        return salary;
    }

    public String toString() {
        System.out.println("Imię: " + name + " Wiek: " + age + " lat " + " Wypłata: " + salary + "zł");
        return name + age + salary;
    }
}
