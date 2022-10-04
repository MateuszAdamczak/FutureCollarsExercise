package com.futurecollars.lekcja4.zadanie4;

public class ToUpperCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}