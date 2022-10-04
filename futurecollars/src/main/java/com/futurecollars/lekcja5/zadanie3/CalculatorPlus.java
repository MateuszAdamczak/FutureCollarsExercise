package com.futurecollars.lekcja5.zadanie3;

public class CalculatorPlus {

    public static void main(String[] args) {

        Sum sum = new Sum();
        double calculate = sum.calculate(3, 4);
        System.out.println(calculate);

        Subtract subtract = new Subtract();
        double calculate2 = subtract.calculate(3, 4);
        System.out.println(calculate2);

        Multiply multiply = new Multiply();
        double calculate3 = multiply.calculate(3, 4);
        System.out.println(calculate3);

        Division division = new Division();
        double calculate4 = division.calculate(4, 2);
        System.out.println(calculate4);
    }
}
