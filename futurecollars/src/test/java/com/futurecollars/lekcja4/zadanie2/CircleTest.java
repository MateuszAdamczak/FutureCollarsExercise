package com.futurecollars.lekcja4.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateArea() {
        //given
        double diameter = 4;
        Circle circle = new Circle(diameter);
        //when
        double result = circle.getArea();
        //then
        assertEquals(12.566370614359172, result);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        double diameter = 6;
        Circle circle = new Circle(diameter);
        //when
        double result = circle.getPerimeter();
        //then
        assertEquals(18.84955592153876, result);
    }
}