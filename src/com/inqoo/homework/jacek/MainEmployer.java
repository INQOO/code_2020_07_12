package com.inqoo.homework.jacek;

import org.w3c.dom.ls.LSOutput;

public class MainEmployer {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jacek", 36, "Advisor");
        Employee employee2 = new Employee("Karina", 25, "Secretary");
        Employee employee3 = new Employee("Olaf", 29, "Supervisor");

        System.out.println(employee1.getName());
        System.out.println(employee2.getPosition());
        System.out.println(employee3.getAge());

    }

}
