package com.futurecollars.lekcja4.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ToUpperCaseFormatterTest {

    @Test
    void shouldGetLowerCaseText() {

        //given
        String text = "nadrabiamy zadanka";
        //when
        String result = new ToUpperCaseFormatter().formatText(text);
        //then
        Assertions.assertEquals("NADRABIAMY ZADANKA", result);
    }
}