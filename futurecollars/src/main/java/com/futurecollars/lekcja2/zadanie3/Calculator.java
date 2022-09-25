package com.futurecollars.lekcja2.zadanie3;

public class Calculator {

    public static void main(String[] args) {

        int a = 4;
        int b = 3;

        System.out.println(sum(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiplicatio(a, b));
        System.out.println(division(a, b));
    }

    public static int sum(int augen, int addend) {
        int addition = augen + addend;
        return addition;
    }

    public static int subtract(int minuend, int subtrahend) {
        int subtraction = minuend - subtrahend;
        return subtraction;
    }

    public static int multiplicatio(int multiplicand, int multiplier) {
        int multiplication = multiplicand * multiplier;
        return multiplication;
    }

    public static int division(int dividend, int divisor) {
        int division = dividend / divisor;
        return division;
    }

}
