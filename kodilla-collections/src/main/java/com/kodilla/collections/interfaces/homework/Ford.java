package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;
    private String model;

    public Ford(String model) {
        this.model = model;
        this.speed = 0;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(int increaseAmount) {
        this.speed += increaseAmount;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 25;
    }
}
