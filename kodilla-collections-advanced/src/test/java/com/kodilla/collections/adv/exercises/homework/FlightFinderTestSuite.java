package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void shouldReturnCorrectFlightsIfDepartureIsProvided() {
        // given
        // flights are provided in FlightRepository class
        // when
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Moscow"));
        expectedList.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedList, result);
    }

    @Test
    public void shouldReturnCorrectFlightsIfArrivalIsProvided() {
        // given
        // flights are provided in FlightRepository class
        // when
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("Siberia");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Moscow", "Siberia"));
        assertEquals(expectedList, result);

    }
}