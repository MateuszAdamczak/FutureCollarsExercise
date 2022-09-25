package com.futurecollars.lekcja3.zadanie3;

public abstract class BaseEmployee {

    private final String name;
    private final String surname;
    private final int yearOfEmployment;

    int basicSalary = 3000;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getName() {
        return "Imię: " + name;
    }

    public String getSurname() {
        return "Nazwisko: " + surname;
    }

    public String getYearOfEmployment() {
        int WorkTime = 2022 - yearOfEmployment;
        return "Pracuje: " + WorkTime + " lat";
    }

    public abstract String calculateMonthlySalary();
}
