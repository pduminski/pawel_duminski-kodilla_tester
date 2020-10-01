package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Seat;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car:cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        Car car1;
        Car car2;
        Car car3;
        int chosenCar = random.nextInt(3) + 1;
        int randomSpeedIncrease = random.nextInt(50) + 30;

        if (chosenCar == 1) {
            car1 = new Ford("Fiesta");
            car1.increaseSpeed(randomSpeedIncrease);
            return car1;
        } else if (chosenCar == 2) {
            car2 = new Jaguar("XF");
            car2. increaseSpeed(randomSpeedIncrease);
            return car2;
        } else {
            car3 = new Seat("Leon");
            car3.increaseSpeed(randomSpeedIncrease);
            return car3;
        }
    }
}

