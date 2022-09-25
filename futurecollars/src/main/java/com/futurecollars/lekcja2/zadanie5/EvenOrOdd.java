package com.futurecollars.lekcja2.zadanie5;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println(sumEvenNumbers(2));
        System.out.println(sumEvenNumbers(3));
    }

    public static String sumEvenNumbers(int firstNumber) {
        String result;
        if (firstNumber % 2 == 1) {
            return "Liczba " + firstNumber + " jest nieparzysta";
        }
        return "Liczba " + firstNumber + " jest parzysta";
    }
}
