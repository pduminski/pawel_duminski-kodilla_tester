package com.kodilla.collections.interfaces.homework;

public class Seat implements Car {
    private int speed;

    public Seat() {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 70;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 35;
    }
}
