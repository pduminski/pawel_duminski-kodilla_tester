package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows(int year, String version) {
        super(year, version);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(" Windows " + getVersion());
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Windows " + getVersion());
    }
}
