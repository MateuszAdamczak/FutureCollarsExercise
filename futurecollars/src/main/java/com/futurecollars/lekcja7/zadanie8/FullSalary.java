package com.futurecollars.lekcja7.zadanie8;

public class FullSalary {

    private BasicSalary basicSalary;
    private SaturdaySalary saturdaySalary;

    public FullSalary(BasicSalary basicSalary, SaturdaySalary saturdaySalary) {
        this.basicSalary = basicSalary;
        this.saturdaySalary = saturdaySalary;
    }

    public int getFullPay(int bonusSalary, int numberSaturday) {
        return basicSalary.getBasicSalary() + bonusSalary + saturdaySalary.getAmountSaturday() * numberSaturday;
    }
}
