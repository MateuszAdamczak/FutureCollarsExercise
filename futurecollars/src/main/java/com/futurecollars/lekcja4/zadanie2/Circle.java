package com.futurecollars.lekcja4.zadanie2;

public class Circle extends Shape {

    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getArea() {
        double radius = diameter / 2;
        double Area = (double) Math.PI * radius * radius;
        return Area;
    }

    @Override
    public double getPerimeter() {
        double radius = diameter / 2;
        double Perimeter = 2 * (double) Math.PI * radius;
        return Perimeter;
    }
}
