package com.futurecollars.lekcja6.zadanie9;

public class DivisibilityValidation {

    public void validate(int[] values) {
        for (int number : values) {
            try {
                if (!isDivisibleByThree(number)) {
                    throw new IllegalArgumentException("Liczba " + number + " nie jest podzielna przez 3");
                }
                System.out.println(number);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
