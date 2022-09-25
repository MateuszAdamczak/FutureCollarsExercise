package com.futurecollars.lekcja3.zadanie3;

public class TicketSeller extends BaseEmployee {

    private final int basicSalary = 3000; //wartości pensji podstawowej.

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    @Override
    public String calculateMonthlySalary() {
        return "Pensja: " + basicSalary;
    }
}
