package com.inqoo.classes.Naszeklasy;

import com.inqoo.classes.Naszeklasy.Telewizor;

public class MainTelewizor {
    public static void main(String[] args) {

        Telewizor panasonic = new Telewizor("Panasonic", "szary", 40);
        Telewizor lg = new Telewizor("LG", "czarny", 52);

        System.out.println(panasonic.marka);
        System.out.println(lg.marka);
    }

}
