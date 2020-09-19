package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows(2001, "XP");
        OperatingSystem linux = new Linux(2004, "Ubuntu");

        windows.turnOn();
        windows.turnOff();

        linux.turnOn();
        linux.turnOff();

    }
}
