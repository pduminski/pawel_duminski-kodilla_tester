package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int year;
    String version;

    public OperatingSystem(int year, String version) {
        this.year = year;
        this.version = version;
    }

    public void turnOn() {
        System.out.print("Turning on");
    }

    public void turnOff() {
        System.out.print("Turning off");
    }

    public String getVersion() {
        return version;
    }
}
