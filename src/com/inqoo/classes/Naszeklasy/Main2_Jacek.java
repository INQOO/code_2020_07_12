package com.inqoo.classes.Naszeklasy;

import com.inqoo.classes.Naszeklasy.Laptop;

public class Main2_Jacek {
    public static void main(String[] args) {
        Laptop domowy = new Laptop("Lenovo", 6, true, 16.0);

        Laptop biznesowy = new Laptop();

        System.out.println(domowy.RAM);
    }
}