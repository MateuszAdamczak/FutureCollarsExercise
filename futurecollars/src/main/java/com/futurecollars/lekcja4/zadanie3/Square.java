package com.futurecollars.lekcja4.zadanie3;

public class Square implements AreaAndPerimetr {

    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

}
