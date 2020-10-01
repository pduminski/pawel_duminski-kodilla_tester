package com.kodilla.collections.interfaces;

public class Triangle implements Shape {
    private double width;
    private double height;
    private double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getArea() {
        return width * height / 2;
    }

    public double getPerimeter() {
        return width + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", hypotenuse=" + hypotenuse +
                '}';
    }
}
