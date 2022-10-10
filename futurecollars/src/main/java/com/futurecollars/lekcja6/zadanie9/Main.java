package com.futurecollars.lekcja6.zadanie9;

public class Main {
    public static void main(String[] args) {
        DivisibilityValidation divisibilityByNumber = new DivisibilityValidation();
        int[] numbers = {3, 6, 12, 8, 31, 9, 22};
        divisibilityByNumber.validate(numbers);
    }
}
