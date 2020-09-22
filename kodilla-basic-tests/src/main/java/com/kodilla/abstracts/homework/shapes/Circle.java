package com.kodilla.abstracts.homework.shapes;

public class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return  2 * Math.PI * radius;
    }
}
