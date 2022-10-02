package com.futurecollars.lekcja4.zadanie2;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA,double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        double Perimeter = sideA + sideA + sideB + sideB;
        return Perimeter;
    }
}

