package com.futurecollars.lekcja3.zadanie3;

public abstract class BaseEmployee {

    private final String name;
    private final String surname;
    private final int yearOfEmployment;
    private final int basicSalary;

    public BaseEmployee(String name, String surname, int yearOfEmployment, int basicSalary) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.basicSalary = basicSalary;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfEmployment() {
        int WorkTime = 2022 - yearOfEmployment;
        return WorkTime;
    }
    public int getBasicSalary() {
        return basicSalary;
    }

    public abstract int calculateMonthlySalary();
}
