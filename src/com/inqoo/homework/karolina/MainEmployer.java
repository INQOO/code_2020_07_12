package com.inqoo.homework.karolina;

import java.math.BigDecimal;

public class MainEmployer {
    public static void main(String[] args) {

        Employee Karolina = new Employee("Karolina", 25);
        Employee Jacek = new Employee("Jacek", 30);
        Employee Marek = new Employee("Marek", 23);

        System.out.println("Wypłata Karoliny to: " + Karolina.increaseSalary(BigDecimal.valueOf(500)));
        Jacek.decreaseSalary(BigDecimal.valueOf(300));
        System.out.println("Wypłata Jacka to: " + Jacek.addBonus());
        System.out.println(Marek.toString());
    }

}

