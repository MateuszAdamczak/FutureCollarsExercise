package com.futurecollars.lekcja2.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ageVerificationTest {

    @Test
    void shouldVerifyAgeEqualTo18() {
        //given
        int age = 18;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertEquals(true , isAdult);

    }
    @Test
    void shouldVerifyAgeEqualTo33() {
        //given
        int age = 33;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertEquals(true , isAdult);
    }
    @Test
    void shouldVerifyAgeEqualTo12() {
        //given
        int age = 12;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertEquals(false, isAdult);
    }
}
