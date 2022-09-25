package com.futurecollars.lekcja2.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ageWerificationTest {

    @Test
    void shouldVerifyAgeEqualTo18() {
        String age = AgeWerification.ageWerification(18);
        Assertions.assertEquals("Pełnoletni", age);
    }
    @Test
    void shouldVerifyAgeEqualTo33() {
        String age = AgeWerification.ageWerification(33);
        Assertions.assertEquals("Pełnoletni", age);
    }
    @Test
    void shouldVerifyAgeEqualTo12() {
        String age = AgeWerification.ageWerification(12);
        Assertions.assertEquals("Niepełnoletni", age);
    }
}
