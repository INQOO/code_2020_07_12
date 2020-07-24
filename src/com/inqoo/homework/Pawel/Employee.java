package com.inqoo.homework.Pawel;

import java.math.BigDecimal;

public class Employee {

    public String name;
    private int age;
    private BigDecimal salary = BigDecimal.valueOf(3000);
    public static final BigDecimal bonus = BigDecimal.valueOf(1.2);

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    };
    public BigDecimal increaseSalary(BigDecimal amount) {
        return salary = salary.add(amount);
    }
    public BigDecimal decreaseSalary(BigDecimal amount){
        return salary = salary.subtract(amount);
    }
    public BigDecimal addBonus(){
            return salary=salary.multiply(bonus);
    }
    void getSalary(){
        System.out.println(salary);
    }

    public String toString(){
        return name+ " " + age + " " + salary;
    }



}
