package com.inqoo.classes;

import com.inqoo.classes.naszeklasy.Laptop;

public class Main2_Jacek {
    public static void main(String[] args) {
        Laptop domowy = new Laptop("Lenovo", 6, true, 16.0);

        Laptop biznesowy = new Laptop();

        System.out.println(domowy.RAM);
    }
}