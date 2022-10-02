package com.futurecollars.lekcja2.zadanie6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysOfTheWeekTest {

    @Test
    void shouldWriteMonday() {
        //given
        int monthNumber = 1;
        //when
        String convertNumberToWeekDay = DaysOfTheWeek.convertNumberToWeekDay(monthNumber);
        //then
        Assertions.assertEquals("Monday", convertNumberToWeekDay);
    }
    @Test
    void shouldWriteWednesday() {
        //given
        int monthNumber = 3;
        //when
        String convertNumberToWeekDay = DaysOfTheWeek.convertNumberToWeekDay(monthNumber);
        //then
        Assertions.assertEquals("Wednesday", convertNumberToWeekDay);
    }
    @Test
    void shouldWriteWeekend() {
        //given
        int monthNumber = 6;
        //when
        String convertNumberToWeekDay = DaysOfTheWeek.convertNumberToWeekDay(monthNumber);
        //then
        Assertions.assertEquals("Weekend", convertNumberToWeekDay);
    }
    @Test
    void shouldWriteCorrectiveText() {
        //given
        int monthNumber = 15;
        //when
        String convertNumberToWeekDay = DaysOfTheWeek.convertNumberToWeekDay(monthNumber);
        //then
        Assertions.assertEquals("There is no such a day!", convertNumberToWeekDay);
    }
}
