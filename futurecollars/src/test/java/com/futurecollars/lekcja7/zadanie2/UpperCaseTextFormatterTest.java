package com.futurecollars.lekcja7.zadanie2;

import com.futurecollars.lekcja7.zadanie2.UpperCaseTextFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class UpperCaseTextFormatterTest {

    @ParameterizedTest
    @ValueSource(strings = {"komputer"})
    void shouldConvertToUpperCase(String input) {
        // given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        // when
        String result = upperCaseTextFormatter.convertToUpperCase(input);
        //then
        Assertions.assertNotNull(result);
        Assertions.assertEquals("KOMPUTER", result);
    }
    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnEmptyStringWhenNullOrEmpty(String input) {
        // given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        // when
        String result = upperCaseTextFormatter.convertToUpperCase(input);
        //then
        Assertions.assertEquals("", result);
    }
}