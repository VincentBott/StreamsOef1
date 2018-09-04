package com.company;

public class Bankrekening {

    private String rekeningnummer;

    private int bedrag;


    public Bankrekening(String rekeningnummer, int bedrag) {

        this.rekeningnummer = rekeningnummer;

        this.bedrag = bedrag;

    }

    public String getRekeningnummer() {

        return rekeningnummer;

    }

    public int getBedrag() {

        return bedrag;

    }
}
