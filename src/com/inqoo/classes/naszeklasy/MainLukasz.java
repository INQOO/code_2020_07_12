package com.inqoo.classes.naszeklasy;

public class MainLukasz {

    public static void main(String[] args) {
        Monitor samsung = new Monitor("Samsung", "4K", 24, "LED");

        System.out.println("Firma: " + samsung.getFirma());
        System.out.println("Rozdzielczość: " + samsung.getRozdzielczosc());
        System.out.println("Przekątna: " + samsung.getPrzekatna());
        System.out.println("Wyświetlacz: " + samsung.getWyswietlacz());

    }
}
