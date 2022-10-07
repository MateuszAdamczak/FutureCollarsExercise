package com.futurecollars.lekcja4.zadanie6;

public class BillCalculator {

    public double calculate(double valueOfTheBill, float serviceFee) {
        return valueOfTheBill + serviceFee;
    }

    public double calculate(double valueOfTheBill, float serviceFee, double discount) {
        return valueOfTheBill - discount + serviceFee;
    }

    public double calculate(double valueOfTheBill, float serviceFee, short packagingFee) {
        return valueOfTheBill + serviceFee + packagingFee;
    }
}
