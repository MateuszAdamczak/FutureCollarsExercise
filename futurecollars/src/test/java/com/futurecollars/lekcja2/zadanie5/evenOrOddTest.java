package com.futurecollars.lekcja2.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class evenOrOddTest {

    @Test
    void shouldWriteOddNumber() {
        String sumEvenNumbers = EvenOrOdd.sumEvenNumbers(5);
        Assertions.assertEquals("Liczba 5 jest nieparzysta", sumEvenNumbers);
    }
    @Test
    void shouldWriteEvenNumber() {
        String sumEvenNumbers = EvenOrOdd.sumEvenNumbers(5);
        Assertions.assertEquals("Liczba 5 jest nieparzysta", sumEvenNumbers);
    }
}
