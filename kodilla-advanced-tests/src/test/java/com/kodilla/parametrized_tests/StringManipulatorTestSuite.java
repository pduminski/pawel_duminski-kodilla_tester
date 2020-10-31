package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test, tset", "OtHEr, rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowercase(String input, String expected) {
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test, 4", "OtHer, 5", "t e s t, 4"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfComas(String input, int expected) {
        assertEquals(expected, manipulator.countNumberOfComas(input));
    }
}