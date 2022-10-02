package com.futurecollars.lekcja4.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateArea() {
        //given
        double sideA = 4;
        //when
        Square square = new Square(sideA);
        double resoult = square.getArea();
        //then
        assertEquals(16, resoult);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        double sideA = 4;
        //when
        Square square = new Square(sideA);
        double resoult = square.getPerimeter();
        //then
        assertEquals(16, resoult);
    }


}