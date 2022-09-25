package com.futurecollars.lekcja2.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    void shouldAddTwoValues2and2() {
        int sum = Calculator.sum(2, 2);
        Assertions.assertEquals(4, sum);
    }
    @Test
    void shouldSubtractTwoValues4and2() {
        int subtract = Calculator.subtract(4, 2);
        Assertions.assertEquals(2, subtract);
    }
    @Test
    void shouldMultiplyTwoValues2and3() {
        int multiplicatio = Calculator.multiplicatio(2, 3);
        Assertions.assertEquals(6, multiplicatio);
    }
    @Test
    void shouldDivideTwoValues3and1() {
        int division = Calculator.division(6, 3);
        Assertions.assertEquals(2, division);
    }
}
