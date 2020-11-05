package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineIncorrectNumbersProvided_numbersOutOfScope.csv")
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
}