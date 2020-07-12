package com.inqoo.classes;

import com.inqoo.classes.naszeklasy.Telewizor;

public class MainTelewizor {
    public static void main(String[] args) {

        Telewizor panasonic = new Telewizor("Panasonic", "szary", 40);
        Telewizor lg = new Telewizor("LG", "czarny", 52);

        System.out.println(panasonic.marka);
        System.out.println(lg.marka);
    }

}
