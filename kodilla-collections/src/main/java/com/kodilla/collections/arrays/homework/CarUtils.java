package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Jaguar;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------------------");
        System.out.println("Car manufacturer: " + getCarName(car) + ", model: " + car.getModel());
        System.out.println("Car speed: " + car.getSpeed());
    }

    public static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Jaguar)
            return "Jaguar";
        else
            return "Seat";
    }
}
