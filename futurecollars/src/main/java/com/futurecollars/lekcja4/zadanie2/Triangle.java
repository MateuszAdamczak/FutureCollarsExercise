package com.futurecollars.lekcja4.zadanie2;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = sideA * height / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }
}
