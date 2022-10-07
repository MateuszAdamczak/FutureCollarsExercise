package com.futurecollars.lekcja2.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenOrOddTest {

    @Test
    void shouldConfirm2AsEven() {
        //given
        int number = 2;
        //when
        boolean isEven = EvenOrOdd.isEven(number);
        //then
        Assertions.assertEquals(true, isEven);
    }
    @Test
    void shouldConfirm5asOdd() {
        //given
        int number = 5;
        //when
        boolean isEven = EvenOrOdd.isEven(number);
        //then
        Assertions.assertEquals(false, isEven);
    }
}
