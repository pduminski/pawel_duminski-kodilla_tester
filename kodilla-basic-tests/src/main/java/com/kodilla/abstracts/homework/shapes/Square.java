package com.kodilla.abstracts.homework.shapes;

public class Square extends Shape {
    int sideA;

    public Square(int sideA) {
        super(4);
        this.sideA = sideA;
    }

    @Override
    public double area() {
        return sideA * sideA;
    }

    @Override
    public double perimeter() {
        return sideA * this.getNumberOfSides();
    }
}
