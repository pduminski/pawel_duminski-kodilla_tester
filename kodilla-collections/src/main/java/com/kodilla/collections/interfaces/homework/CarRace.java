package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;

public class CarRace {
    public static void main(String[] args) {
        Car car1 = new Jaguar();
        Car car2 = new Ford();
        Car car3 = new Seat();

        doRace(car1);
        doRace(car2);
        doRace(car3);

    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}
