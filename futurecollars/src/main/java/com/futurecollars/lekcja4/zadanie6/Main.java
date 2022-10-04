package com.futurecollars.lekcja4.zadanie6;

public class Main {

    public static void main(String[] args) {

        short packagingFee = 2;

        BillCalculator billCalculator = new BillCalculator();
        System.out.println(billCalculator.calculate(200, 20, 50));
        System.out.println(billCalculator.calculate(200, 20, packagingFee));
        System.out.println(billCalculator.calculate(150, 0));
    }
}
