package com.futurecollars.lekcja2.zadanie6;

public class DaysOfTheWeek {
    public static void main(String[] args) {

        System.out.println(printYearSeason(10));
        System.out.println(printYearSeason(1));
        System.out.println(printYearSeason(5));
        System.out.println(printYearSeason(7));

    }

    public static String printYearSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return ("Monday");
            case 2:
                return ("Tuesday");
            case 3:
                return ("Wednesday");
            case 4:
                return ("Thursday");
            case 5:
                return ("Friday");
            case 6:
            case 7:
                return ("Weekend");
            default:
                return ("There is no such a day!");
        }
    }
}
