package com.kodilla.abstracts.homework.shapes;

public class Application {
    public static void main(String[] args) {
        Shape rectangular = new Rectangular(4, 5);
        Shape square = new Square(5);
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4, 5, 5);

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(rectangular);
        processor.process(square);
        processor.process(circle);
        processor.process(triangle);

    }
}
