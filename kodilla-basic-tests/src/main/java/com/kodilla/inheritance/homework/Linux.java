package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{
    public Linux(int year, String version) {
        super(year, version);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(" Linux " + getVersion());
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Linux " + getVersion());
    }
}
