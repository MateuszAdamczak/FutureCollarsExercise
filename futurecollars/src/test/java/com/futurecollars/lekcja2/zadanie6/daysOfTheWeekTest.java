package com.futurecollars.lekcja2.zadanie6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class daysOfTheWeekTest {

    @Test
    void shouldWriteMonday() {
        String printYearSeason = DaysOfTheWeek.printYearSeason(1);
        Assertions.assertEquals("Monday", printYearSeason);
    }
    @Test
    void shouldWriteWednesday() {
        String printYearSeason = DaysOfTheWeek.printYearSeason(3);
        Assertions.assertEquals("Wednesday", printYearSeason);
    }
    @Test
    void shouldWriteWeekend() {
        String printYearSeason = DaysOfTheWeek.printYearSeason(6);
        Assertions.assertEquals("Weekend", printYearSeason);
    }
    @Test
    void shouldWriteCorrectiveText() {
        String printYearSeason = DaysOfTheWeek.printYearSeason(15);
        Assertions.assertEquals("There is no such a day!", printYearSeason);
    }
}
