package com.kodilla.collections.interfaces.homework;

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
        car.increaseSpeed(100);
        car.increaseSpeed(115);
        car.increaseSpeed(110);
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}
