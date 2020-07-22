package com.inqoo.Homework.Przemek;

import java.math.BigDecimal;

public class MainEmployer {

    public static void main(String[] args) {

        Employee Karolina = new Employee("Karolina", 25);
        Employee Przemek = new Employee("Przemek", 25);
        Employee Mietek = new Employee("Mietek", 30);

        Karolina.increaseSalary(BigDecimal.valueOf(500));
        Karolina.getSalary();

        Przemek.decreaseSalary(BigDecimal.valueOf(300));
        Przemek.addBonus(true);
        Przemek.getSalary();

        Mietek.toString();


    }
}

