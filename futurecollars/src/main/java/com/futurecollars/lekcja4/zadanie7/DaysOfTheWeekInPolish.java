package com.futurecollars.lekcja4.zadanie7;

public class DaysOfTheWeekInPolish {

    public String getNameDays(DaysOfTheWeek day) {

        String nameDay;

        switch (day) {

            case MONDAY:
                nameDay = "PONIĘDZIAŁEK";
                break;
            case TUESDAY:
                nameDay = "WTOREK";
                break;
            case WEDNESDAY:
                nameDay = "ŚRODA";
                break;
            case THURSDAY:
                nameDay = "CZWARTEK";
                break;
            case FRIDAY:
                nameDay = "PIĄTEK";
                break;
            case SATURDAY:
                nameDay = "SOBOTA";
                break;
            case SUNDAY:
                nameDay = "NIEDZIELA";
                break;
            default:
                nameDay = "BŁAD";
        }
        return nameDay;
    }
}
