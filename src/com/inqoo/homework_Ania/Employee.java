package com.inqoo.homework_Ania;

import java.math.BigDecimal;

public class Employee {
    String name;
    int age;
    BigDecimal salary = new BigDecimal(3000);
    public static final BigDecimal bonus = new BigDecimal(1.2);

    BigDecimal increaseSalary(BigDecimal kwota) {
        return salary = salary.add(kwota);
    }

    BigDecimal decreaseSalary(BigDecimal kwota) {
        return salary = salary.subtract(kwota);
    }

    BigDecimal addBonus() {
        return salary = salary.multiply(bonus);
    }

    BigDecimal getSalary() {
        return salary;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

}


