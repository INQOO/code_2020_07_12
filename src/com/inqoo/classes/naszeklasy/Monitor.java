package com.inqoo.classes.naszeklasy;

public class Monitor {

    private String firma;
    private String rozdzielczosc;
    private int przekatna;
    private String wyswietlacz;

        public Monitor(String firma, String rozdzielczosc, int przekatna, String wyswietlacz)
        {
           this.firma = firma;
           this.rozdzielczosc = rozdzielczosc;
           this.przekatna = przekatna;
           this.wyswietlacz = wyswietlacz;
        }

    public String getFirma() { return firma; }
    public String getRozdzielczosc() { return rozdzielczosc; }
    public int getPrzekatna() { return przekatna; }
    public String getWyswietlacz() { return wyswietlacz; }

    }

