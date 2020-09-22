package com.kodilla.abstracts.homework.shapes;

public class Rectangular extends Square {
    private int sideB;

    public Rectangular(int sideA, int sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (2 * sideA) + (2 * sideB);
    }
}
