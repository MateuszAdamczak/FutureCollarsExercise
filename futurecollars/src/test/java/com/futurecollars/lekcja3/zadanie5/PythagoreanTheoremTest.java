package com.futurecollars.lekcja3.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PythagoreanTheoremTest {

    @Test
    void shouldCheckThePythagoreanTheorem() {
        String Pythagorean = PythagoreanTheorem.Pythagorean(6, 8, 10);
        Assertions.assertEquals("Jest prostokątny", Pythagorean);
    }

    @Test
    void shouldCheckThePythagoreanTheorem2() {
        String Pythagorean = PythagoreanTheorem.Pythagorean(2, 4, 6);
        Assertions.assertEquals("Nie jest prostokątny", Pythagorean);
    }
}
