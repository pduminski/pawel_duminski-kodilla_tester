package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Smok Wawelski", "3x5", true));
        stamps.add(new Stamp("Syrenka Warszawska", "4x6", true));
        stamps.add(new Stamp("Lajkonik", "2x3", false));
        stamps.add(new Stamp("Smok Wawelski", "3x5", true));
        stamps.add(new Stamp("Smok Wawelski", "3x5", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
