package com.inqoo.classes.naszeklasy;

public class Klasa1a {

    private String szkola;
    private String klasaa;
    private int rocznik;
    private double uczniowie;
    private String ulubionyColor;
    private boolean biolchem;

    public Klasa1a(String szkola, String klasaa, int rocznik, double uczniowie, String ulubionyColor, boolean biolchem) {
        this.szkola = szkola;
        this.klasaa = klasaa;
        this.rocznik = rocznik;
        this.uczniowie = uczniowie;
        this.ulubionyColor = ulubionyColor;
        this.biolchem = biolchem;

    }

        public String getSzkola() { return szkola; }
        public String getKlasaa() { return klasaa; }
        public int getRocznik() { return rocznik; }
        public double getUczniowie() { return uczniowie; }
        public String getUlubionyColor() {return ulubionyColor; }
        public boolean getBiolchem() {return biolchem; }





}