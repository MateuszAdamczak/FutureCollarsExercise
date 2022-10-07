package com.futurecollars.lekcja2.zadanie5;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println(isEven(2));
        System.out.println(isEven(3));
    }

    public static boolean isEven(int firstNumber) {
        if (firstNumber % 2 == 1) {
            return false;
        }
        return true;
    }
}
