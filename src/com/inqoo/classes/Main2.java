package com.inqoo.classes;

public class Main2 {

    public static void main(String[] args) {
//        Car twingoMustang = new Car(
//                "",
//                "Twingo",
//                false,
//                2020,
//                5.0,
//                "Pink"
//        );

        Car noweAuto = new Car();
        noweAuto.brand = "Renault";
        noweAuto.model = "Twingo";
//        noweAuto.year = 2020;
        System.out.println(noweAuto.brand);

        Car opelAgila = new Car();
        String brand = opelAgila.getBrand();




        System.out.println(opelAgila.getYear());
        System.out.println(brand);
    }
}
