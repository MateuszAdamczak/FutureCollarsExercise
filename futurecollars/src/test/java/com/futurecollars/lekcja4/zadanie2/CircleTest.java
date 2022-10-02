package com.futurecollars.lekcja4.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldCalculateArea() {
        //given
        double diameter = 4;
        //when
        Circle circle = new Circle(diameter);
        double resoult = circle.getArea();
        //then
        assertEquals(12.566370614359172, resoult);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        double diameter = 6;
        //when
        Circle circle = new Circle(diameter);
        double resoult = circle.getPerimeter();
        //then
        assertEquals(18.84955592153876, resoult);
    }
}