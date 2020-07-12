package com.inqoo.classes;


import com.inqoo.classes.naszeklasy.Komputer;

public class MainPawel {
    public static void main(String[] args) {
        Car twingo = new Car("Renault",
                "Twingo", 2011,
                3.2,
                "różowy");

        Car opelAgila = new Car();

        String opelAgilaModel = opelAgila.getModel();

        System.out.println(opelAgila.getYear());
        System.out.println(opelAgilaModel);

        Komputer lenovo = new Komputer("i5", 12, "GTX2070", 512, false);
        System.out.println(lenovo);
        System.out.println(lenovo.grafika);


    }
}
