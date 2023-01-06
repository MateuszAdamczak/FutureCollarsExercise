package com.futurecollars.lekcja6.zadanie7;

public class Element {
    private double number;

    public Element(double number) {
        this.number = number;
    }


    public double calculateRoot() {
        if (number > 0) {
            System.out.println(Math.sqrt(number));
        } else if (number < 0) {
            throw new IllegalArgumentException();
        }
        return number;
    }
}
