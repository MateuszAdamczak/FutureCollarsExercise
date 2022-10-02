package com.futurecollars.lekcja3.zadanie1;

public class main {

    public static void main(String[] args) {

        PlaceInCinema placeInCinema = new PlaceInCinema(1, 2, true);
        System.out.println(placeInCinema.getNumer());
        System.out.println(placeInCinema.getRzad());
        System.out.println(placeInCinema.isFree());
        placeInCinema.setisFree(false);
        System.out.println(placeInCinema.isFree());
    }
}
