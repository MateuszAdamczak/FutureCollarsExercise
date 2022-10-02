package com.futurecollars.lekcja4.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldGetAreaSquare() {
        // given
        int number = 4;
        // when
        double result = new Square(number).getArea();
        // then
        Assertions.assertEquals(16, result);
    }

    @Test
    void shouldGetPerimeterSquare() {
        // given
        int number = 5;
        // when
        double result = new Square(number).getPerimeter();
        // then
        Assertions.assertEquals(20, result);
    }
}