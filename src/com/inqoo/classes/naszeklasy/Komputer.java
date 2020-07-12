package com.inqoo.classes.naszeklasy;

public class Komputer {

    private String procesor;
    private int pamiec;
    public String grafika;
    private int pojemnoscDysku;
    private boolean windows;

    public Komputer(String procesor, int pamiec, String grafika, int dysk, boolean windows) {
        this.procesor = procesor;
        this.pamiec = pamiec;
        this.grafika = grafika;
        this.pojemnoscDysku = dysk;
        this.windows = windows;


    }

}
