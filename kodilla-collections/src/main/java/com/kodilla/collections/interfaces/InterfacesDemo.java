package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Shape shape1 = new Square(10.00);
        Shape shape2 = new Circle(7.00);
        Shape shape3 = new Triangle(6.0, 4.0, 7.211);

        showShapeDetails(shape1);
        showShapeDetails(shape2);
        showShapeDetails(shape3);
    }

    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
