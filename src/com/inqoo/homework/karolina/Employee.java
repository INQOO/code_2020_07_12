package com.inqoo.homework.karolina;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final int age;
    private BigDecimal salary = new BigDecimal(3000);
    public static final BigDecimal bonus = BigDecimal.valueOf(1.2);

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    BigDecimal increaseSalary(BigDecimal amount) {
        return salary = this.salary.add(amount);
    }
    BigDecimal decreaseSalary(BigDecimal amount) {
        return salary = this.salary.subtract(amount);
    }
    BigDecimal addBonus() {
        return salary = this.salary.multiply(bonus);
    }
    BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

