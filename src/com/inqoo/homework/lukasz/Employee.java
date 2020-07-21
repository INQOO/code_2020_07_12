package com.inqoo.homework.lukasz;

import java.math.BigDecimal;

  class Employee {

    private String name;
    private int age;
    private BigDecimal salary = new BigDecimal(3000);

     private static final BigDecimal bonus = BigDecimal.valueOf(1.2);

     BigDecimal increaseSalary(BigDecimal amount) {

         return salary = salary.add(amount);
    }

     BigDecimal decreaseSalary(BigDecimal amount){
         return salary = salary.subtract(amount);
    }

     BigDecimal addBonus(){

         return salary = salary.multiply(bonus);
    }

     void getSalary(){
         System.out.println(salary);
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Imie: " + name + ", Wiek: " + age + ", Wypłata: " + salary;
  }
}
