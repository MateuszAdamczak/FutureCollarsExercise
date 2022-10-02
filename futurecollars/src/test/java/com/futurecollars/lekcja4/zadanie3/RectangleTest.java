package com.futurecollars.lekcja4.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldGetAreaRectangle() {
        // given
        int number1 = 4;
        int number2 = 5;
        // when
        double result = new Rectangle(number1, number2).getArea();
        // then
        Assertions.assertEquals(20, result);
    }

    @Test
    void shouldGetPerimeterRectangle() {
        // given
        int number1 = 5;
        int number2 = 6;
        // when
        double result = new Rectangle(number1, number2).getPerimeter();
        // then
        Assertions.assertEquals(22, result);
    }

}