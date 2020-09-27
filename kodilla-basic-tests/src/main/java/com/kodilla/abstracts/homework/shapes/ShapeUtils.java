package com.kodilla.abstracts.homework.shapes;

public class ShapeUtils {
    public static void describeShape(Shape shape) {
        System.out.println("------------------------------");
        System.out.println("Shape: " + getShapeName(shape));
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
    }

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Rectangular)
            return "Rectangular";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Triangle";
    }
}
