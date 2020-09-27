package com.kodilla.abstracts.homework.shapes;


public class Application {
    public static void main(String[] args) {
        Shape rectangular = new Rectangular(4, 5);
        Shape square = new Square(5);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5, 5);

        ShapeUtils.describeShape(rectangular);
        ShapeUtils.describeShape(square);
        ShapeUtils.describeShape(circle);
        ShapeUtils.describeShape(triangle);




    }
}
