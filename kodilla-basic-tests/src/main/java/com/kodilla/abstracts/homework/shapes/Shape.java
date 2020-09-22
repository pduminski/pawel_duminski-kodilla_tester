package com.kodilla.abstracts.homework.shapes;

public abstract class Shape {
    private int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double area();
    public abstract double perimeter();
}
