package com.futurecollars.lekcja4.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        //given
        double sideA = 4;
        double sideB = 5;
        Rectangle rectangle = new Rectangle(sideA, sideB);
        //when
        double resoult = rectangle.getArea();
        //then
        assertEquals(20, resoult);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        double sideA = 4;
        double sideB = 5;
        Rectangle rectangle = new Rectangle(sideA, sideB);
        //when
        double resoult = rectangle.getPerimeter();
        //then
        assertEquals(18, resoult);
    }
}