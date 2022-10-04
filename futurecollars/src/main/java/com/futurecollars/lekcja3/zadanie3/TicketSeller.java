package com.futurecollars.lekcja3.zadanie3;

public class TicketSeller extends BaseEmployee {


    public TicketSeller(String name, String surname, int yearOfEmployment, int basicSalary) {
        super(name, surname, yearOfEmployment, basicSalary);
    }

    @Override
    public int calculateMonthlySalary() {
        return getBasicSalary();
    }
}
