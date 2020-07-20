package com.inqoo.homework.lukasz;

import java.math.BigDecimal;

public class Employee {

    private String name;
    private int age;
    private BigDecimal salary = new BigDecimal(3000);

    public static final BigDecimal bonus = BigDecimal.valueOf(1.2);

    public BigDecimal increaseSalary(BigDecimal amount) {
        return salary = amount.add(this.salary);
    }

    public BigDecimal decreaseSalary(BigDecimal amount){
          return salary = this.salary.subtract(amount);
    }

    public BigDecimal addBonus(){
        return this.salary = this.salary.multiply(bonus);
    }

    public BigDecimal getSalary(){
        return this.salary;
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

  public  String toString(){
        return "Imie: " + name + ", Wiek: " + age + ", Wypłata: " + salary;
  }
}
