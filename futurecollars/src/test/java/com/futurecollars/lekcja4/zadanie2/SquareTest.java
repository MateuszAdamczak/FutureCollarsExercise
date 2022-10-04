package com.futurecollars.lekcja4.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateArea() {
        //given
        double sideA = 4;
        Square square = new Square(sideA);
        //when
        double result = square.getArea();
        //then
        assertEquals(16, result);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        double sideA = 4;
        Square square = new Square(sideA);
        //when
        double result = square.getPerimeter();
        //then
        assertEquals(16, result);
    }


}