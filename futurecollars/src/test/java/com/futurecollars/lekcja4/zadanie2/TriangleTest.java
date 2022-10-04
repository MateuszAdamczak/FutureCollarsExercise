package com.futurecollars.lekcja4.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldCalculateArea() {
        //given
        double sideNumber1 = 3;
        double sideNumber2 = 4;
        double sideNumber3 = 5;
        double height = 4;
        Triangle triangle = new Triangle(sideNumber1, sideNumber2, sideNumber3, height);
        //when
        double resoult = triangle.getArea();
        //then
        assertEquals(6.0, resoult);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        double sideNumber1 = 3;
        double sideNumber2 = 4;
        double sideNumber3 = 5;
        double height = 4;
        Triangle triangle = new Triangle(sideNumber1, sideNumber2, sideNumber3, height);
        //when
        double resoult = triangle.getPerimeter();
        //then
        assertEquals(12.0, resoult);
    }
}