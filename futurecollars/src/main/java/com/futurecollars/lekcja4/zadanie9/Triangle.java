package com.futurecollars.lekcja4.zadanie9;

public class Triangle {

    private int width;
    private int height;

    Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ",height=" + height + "}";
    }
}
