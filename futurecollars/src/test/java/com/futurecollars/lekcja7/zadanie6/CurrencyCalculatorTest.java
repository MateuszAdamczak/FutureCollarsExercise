package com.futurecollars.lekcja7.zadanie6;

import static org.junit.jupiter.api.Assertions.*;

import com.futurecollars.lekcja7.zadanie6.Currency;
import com.futurecollars.lekcja7.zadanie6.CurrencyCalculator;
import com.futurecollars.lekcja7.zadanie6.CurrencyExchangeRate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CurrencyCalculatorTest {

    @Test
    void shouldCalculatorExchangeRateBuy() {
        // given
        int amount = 45;
        CurrencyExchangeRate currencyExchangeRateMock = Mockito.mock(CurrencyExchangeRate.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyExchangeRateMock);
        Mockito.when(currencyExchangeRateMock.getBuyRate(Currency.EUR)).thenReturn(0.472D);
        // when
        double result = currencyCalculator.calculateExchangeBuy(amount, Currency.EUR);
        // then
        Assertions.assertEquals(21.24, result);
    }

    @Test
    void shouldCalculatorExchangeRateSell() {
        // given
        int amount = 42;
        CurrencyExchangeRate currencyExchangeRateMock = Mockito.mock(CurrencyExchangeRate.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(currencyExchangeRateMock);
        Mockito.when(currencyExchangeRateMock.getSellRate(Currency.EUR)).thenReturn(0.475D);
        // when
        double result = currencyCalculator.calculateExchangeSell(amount, Currency.EUR);
        // then
        Assertions.assertEquals(19.95, result);
    }
}