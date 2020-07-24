package com.inqoo.homework.Pawel;

import java.math.BigDecimal;

public class MainEmployer {

    public static void main(String[] args) {
        Employee pracownik1 = new Employee("Wiesiu",33);
        Employee pracownik2 = new Employee("Zdzisiu",44);
        Employee pracownik3 = new Employee("Krzysiu",55);

        pracownik1.increaseSalary(BigDecimal.valueOf(500));
        pracownik1.getSalary();

        pracownik2.decreaseSalary(BigDecimal.valueOf(300));
        pracownik2.addBonus();
        pracownik2.getSalary();

        System.out.println(pracownik3.toString());



    }

}
