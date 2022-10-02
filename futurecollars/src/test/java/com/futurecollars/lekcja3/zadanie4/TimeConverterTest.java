package com.futurecollars.lekcja3.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeConverterTest {

    @Test
    void shouldConverting2MinutesTo120Seconds() {
        //given
        int minutes = 2;
        //when
        int convertingMinutesToSeconds = TimeConverter.convertingMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(120, convertingMinutesToSeconds);
    }
    @Test
    void shouldConverting5MinutesTo300Seconds() {
        //given
        int minutes = 5;
        //when
        int convertingMinutesToSeconds = TimeConverter.convertingMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(300, convertingMinutesToSeconds);
    }
}
