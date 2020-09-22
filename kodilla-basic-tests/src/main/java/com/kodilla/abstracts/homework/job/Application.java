package com.kodilla.abstracts.homework.job;

public class Application {
    public static void main(String[] args) {
        Job doctor = new Doctor(10000);
        Job firefighter = new Firefighter(3500);
        Job policeman = new Policeman(4000);

        Person toby = new Person("Toby", 39, doctor);
        Person tonny = new Person("Tonny", 19, new Policeman(2000));

        toby.getResponsibilities();
        tonny.getResponsibilities();
    }


}
