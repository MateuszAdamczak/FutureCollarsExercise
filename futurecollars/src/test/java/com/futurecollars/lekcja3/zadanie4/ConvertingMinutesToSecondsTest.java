package com.futurecollars.lekcja3.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertingMinutesToSecondsTest {

    @Test
    void shouldConverting2MinutesTo120Seconds() {
        int Converting = ConvertingMinutesToSeconds.ConvertingMinutesToSeconds(2);
        Assertions.assertEquals(120, Converting);
    }
    @Test
    void shouldConverting5MinutesTo300Seconds() {
        int Converting = ConvertingMinutesToSeconds.ConvertingMinutesToSeconds(5);
        Assertions.assertEquals(300, Converting);
    }
}
