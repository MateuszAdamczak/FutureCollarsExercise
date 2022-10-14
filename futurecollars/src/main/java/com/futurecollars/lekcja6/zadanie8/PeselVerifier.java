package com.futurecollars.lekcja6.zadanie8;

public class PeselVerifier {

    public void VerifyNumberPesel(String pesel) {
        try {
            Long.valueOf(pesel);
            if (pesel.length() != 11) {
                throw new IllegalLengthException("PESEL powinien posiadać 11 cyfr");
            }
        } catch (NumberFormatException e) {
            throw new WrongTypeOfDataException("PESEL powinien posiadać tylko cyfry");
        }
    }
}
