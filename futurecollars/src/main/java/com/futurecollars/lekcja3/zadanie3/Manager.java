package com.futurecollars.lekcja3.zadanie3;

public class Manager extends BaseEmployee {

    private final int basicSalary = 5000; //wartości pensji podstawowej.
    private int salaryBonus;

    public Manager(String name, String surname, int yearOfEmployment, int salaryBonus) {
        super(name, surname, yearOfEmployment);
        this.salaryBonus = salaryBonus;
    }

    @Override
    public String calculateMonthlySalary() {
        int salarySum = basicSalary + salaryBonus;
        return "Pensja: " + salarySum;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus; //Dodaj możliwość zmiany wysokości bonusu dla managera
    }
}
