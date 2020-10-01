package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarsListApplication {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Ford> cars = new ArrayList<>();
        cars.add(new Ford("Fiesta"));
        cars.add(new Ford("Focus"));
        Ford ford = new Ford("Mustang");
        cars.add(ford);

        System.out.println(cars.size());
        for (Ford car : cars) {
            car.increaseSpeed(rand.nextInt(50) + 100);
            CarUtils.describeCar(car);
        }

        cars.remove(0);
        cars.remove(ford);

        System.out.println(cars.size());
        for (Ford car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
