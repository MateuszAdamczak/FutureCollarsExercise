package com.futurecollars.lekcja3.zadanie1;

public class PlaceInCinema {

    private final int number;
    private final int row;
    private boolean isFree;


    public PlaceInCinema(int numer, int rzad, boolean wolne) {
        this.number = numer;
        this.row = rzad;
        this.isFree = wolne;
    }

    public String getNumer() {
        return "Miejsce: " + number;
    }

    public String getRzad() {
        return "Rząd: " + row;
    }

    public String isFree() {
        if (isFree)
            return "Wolne";
        return "Zajęte";
    }

    public void setisFree(boolean jestWolne) {
        this.isFree = jestWolne;
    }
}
