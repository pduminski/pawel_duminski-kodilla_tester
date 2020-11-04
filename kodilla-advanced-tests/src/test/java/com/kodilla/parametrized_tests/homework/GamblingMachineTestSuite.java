package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine machine = new GamblingMachine();

    @Test
    public void shouldReturnZeroIfInputIsOutOfBoundsVariant1() throws InvalidNumbersException{
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(51, 52, 53, 54, 54, 55, 56));

        assertEquals(0, machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMarchineUserInputWhichNeverWins.csv")
    public void shouldReturnZeroIfInputIsOutOfBoundsVariant2(
            int num1, int num2, int num3, int num4, int num5, int num6) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(num1, num2, num3, num4, num5, num6));
        System.out.println(userNumbers);
        assertEquals(0, machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineSpaces.csv")
    public void shouldReturnZeroIfInputIsOutOfBoundsVariant5(String numbers) throws InvalidNumbersException {
        String[] numbersString = numbers.split(" ");
        for (int i = 0; i < numbersString.length; i++) {
            System.out.println(numbersString[i]);
        }
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : numbersString) {
            userNumbers.add(Integer.parseInt(number));
        }
        System.out.println(userNumbers);
        assertEquals(0, machine.howManyWins(userNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMarchineUserInputWhichNeverWins.csv")
    public void shouldReturnZeroIfInputIsOutOfBoundsVariant3(int ... numbers) throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        for (Integer number : numbers) {
            userNumbers.add(number);
        }
        assertEquals(0, machine.howManyWins(userNumbers));
    }

//    @ParameterizedTest(expected = InvalidNumbersException.class)
    @CsvFileSource(resources = "/gamblingMachineUserInputIncorrect.csv")
    public void shouldThrowExceptionIfValuesDoNotPassValidationVariant1() throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        assertEquals(0, machine.howManyWins(userNumbers));
    }
}