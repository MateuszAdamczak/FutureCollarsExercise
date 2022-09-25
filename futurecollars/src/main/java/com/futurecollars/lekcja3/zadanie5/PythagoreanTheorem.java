package com.futurecollars.lekcja3.zadanie5;

public class PythagoreanTheorem {

    public static String Pythagorean(int a, int b, int c) {
        int AorB = a * a + b * b;
        int C = c * c;

        if (AorB == C)
            return "Jest prostokątny";
        return "Nie jest prostokątny";
    }
}
