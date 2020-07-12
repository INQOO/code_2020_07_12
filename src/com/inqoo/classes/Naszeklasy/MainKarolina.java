package com.inqoo.classes.Naszeklasy;

import com.inqoo.classes.Naszeklasy.Hulajnoga;

public class MainKarolina {
    public static void main(String[] args) {

        Hulajnoga Karolina = new Hulajnoga("Pro",
                "Xiaomi",
                2020,
                "red",
                false);
        System.out.println("Mam nową " + Karolina.brand + " w kolorze " + Karolina.color);
    }
}
