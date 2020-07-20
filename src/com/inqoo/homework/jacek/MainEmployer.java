package com.inqoo.homework.jacek;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class MainEmployer {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jacek", 36, "Advisor");
        Employee employee2 = new Employee("Karina", 25, "Secretary");
        Employee employee3 = new Employee("Olaf", 29, "Supervisor");

        employee1.increaseSalary(new BigDecimal("500"));
        System.out.println("Wynagrodzenie pracownika " + employee1.getName() + " wynosi: " + employee1.getSalary());

        employee2.decreaseSalary(new BigDecimal("300"));
        employee2.addBonus();
        System.out.println("Wynagrodzenie pracownika " + employee2.getName() + " wynosi: " + employee2.getSalary());

        System.out.println(employee3.toString());
    }
}