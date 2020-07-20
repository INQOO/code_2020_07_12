package com.inqoo.homework.lukasz;

import java.math.BigDecimal;

public class MainEmployer {

    public static void main(String[] args) {
        Employee pracownik1 = new Employee("Ola", 21);
        Employee pracownik2 = new Employee("Rafał", 37);
        Employee pracownik3 = new Employee("Jakub", 25);

        System.out.println("Pracownik1: " + pracownik1.increaseSalary(BigDecimal.valueOf(500)));

        pracownik2.decreaseSalary(BigDecimal.valueOf(300));
        pracownik2.addBonus();
        System.out.println("Pracownik2: " + pracownik2.getSalary());

        System.out.println(pracownik3.toString());
    }
}
