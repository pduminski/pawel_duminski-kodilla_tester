package com.kodilla.collections.sets;

import com.kodilla.collections.sets.homework.Stamp;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class StampTestSuite {

    @Test
    public void stampCollectionHasOnlyUniqueElements() {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Syrenka", "3x6", true));
        stamps.add(new Stamp("Lajkonik", "3x6", true));
        stamps.add(new Stamp("Smok", "2x5", false));
        stamps.add(new Stamp("Syrenka samochod", "4x7", true));
        stamps.add(new Stamp("Syrenka", "3x6", true));
        stamps.add(new Stamp("Syrenka", "3x6", true));

        assertEquals(4, stamps.size());
    }
}
