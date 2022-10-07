package com.futurecollars.lekcja4.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCaseFormatterTest {

    @Test
    void shouldGetLowerCaseText() {

        //given
        String text = "NADRABIAMY ZADANKA";
        //when
        String result = new ToLowerCaseFormatter().formatText(text);
        //then
        Assertions.assertEquals("nadrabiamy zadanka", result);
    }
}