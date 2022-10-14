package com.futurecollars.lekcja6.zadanie8;

public class Main {

    public static void main(String[] args) throws WrongTypeOfDataException, IllegalLengthException {

        PeselVerifier pesel = new PeselVerifier();
        pesel.VerifyNumberPesel("12345678903");
    }
}
