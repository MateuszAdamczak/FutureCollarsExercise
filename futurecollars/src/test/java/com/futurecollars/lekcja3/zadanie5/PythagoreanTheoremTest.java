package com.futurecollars.lekcja3.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PythagoreanTheoremTest {

    @Test
    void shouldCheckThePythagoreanTheorem() {
        //given
        int firstSide = 6;
        int secoundSide = 8;
        int thirdSide = 10;
        //when
        boolean isTriangleRectangular = PythagoreanTheorem.isTriangleRectangular(firstSide, secoundSide, thirdSide);
        //then
        Assertions.assertEquals(true, isTriangleRectangular);
    }

    @Test
    void shouldCheckThePythagoreanTheorem2() {
        //given
        int firstSide = 3;
        int secoundSide = 4;
        int thirdSide = 5;
        //when
        boolean isTriangleRectangular = PythagoreanTheorem.isTriangleRectangular(firstSide, secoundSide, thirdSide);
        //then;
        Assertions.assertEquals(true, isTriangleRectangular);
    }
}
