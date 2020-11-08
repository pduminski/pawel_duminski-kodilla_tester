package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonBMISource#providePeopleWithCertainBMIForTesting")
    public void shouldReturnCorrectBMIForEveryPerson(String expected, Double heightInMeters, Double weightInKilograms) {
        Person person = new Person(heightInMeters, weightInKilograms);
        assertEquals(expected, person.getBMI());
    }

}