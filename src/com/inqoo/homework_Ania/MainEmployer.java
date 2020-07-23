package com.inqoo.homework_Ania;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MainEmployer {
    public static void main(String[] args) {
        Employee pracownik1 = new Employee("Kasia", 26);
        Employee pracownik2 = new Employee("Basia", 33);
        Employee pracownik3 = new Employee("Ewa", 47);

        pracownik1.increaseSalary(new BigDecimal(500));
        System.out.println(pracownik1.getSalary());

        pracownik2.decreaseSalary(new BigDecimal(300));
        pracownik2.addBonus();
        System.out.println(pracownik2.getSalary().setScale(0, RoundingMode.UP));

        System.out.println("Imię: " + pracownik3.name.toString() + " Wiek: " + pracownik3.age + " Płaca: " + pracownik3.getSalary().toString());


    }

}
