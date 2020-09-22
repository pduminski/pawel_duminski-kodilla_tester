package com.kodilla.abstracts.homework.shapes;

public class Triangle extends Shape {
    int sideA;
    int sideB;
    int sideC;
    int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        super(3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * sideA * height;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
