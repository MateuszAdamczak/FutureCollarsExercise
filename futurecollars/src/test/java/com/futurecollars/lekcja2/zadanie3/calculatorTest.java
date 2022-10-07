package com.futurecollars.lekcja2.zadanie3;

import com.futurecollars.lekcja4.zadanie2.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    @Test
    void shouldAddTwoValues2and2() {
        //given
        int firstNumber = 2;
        int secoundNumber = 2;
        //when
        int sum = Calculator.sum(firstNumber, secoundNumber);
        //then
        Assertions.assertEquals(4, sum);
    }

    @Test
    void shouldSubtractTwoValues4and2() {
        //given
        int firstNumber = 2;
        int secoundNumber = 4;
        //when
        int subtract = Calculator.subtract(secoundNumber, firstNumber);
        //then
        Assertions.assertEquals(2, subtract);
    }

    @Test
    void shouldMultiplyTwoValues2and3() {
        //given
        int firstNumber = 2;
        int secoundNumber = 3;
        //when
        int multiplicatio = Calculator.multiplicatio(firstNumber, secoundNumber);
        //then
        Assertions.assertEquals(6, multiplicatio);
    }

    @Test
    void shouldDivideTwoValues6and3() {
        //given
        int firstNumber = 6;
        int secoundNumber = 3;
        //whem
        int division = Calculator.division(firstNumber, secoundNumber);
        //then
        Assertions.assertEquals(2, division);
    }
}
