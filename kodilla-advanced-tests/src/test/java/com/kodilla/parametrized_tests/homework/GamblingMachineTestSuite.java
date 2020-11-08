package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Random;
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

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineNumbersWhichWillNotPassValidation.csv")
    public void shouldThrowExceptionIfNumberOfElementsIsBelowOrOverTheRequiredSix(String numbers) throws InvalidNumbersException {
        String[] stringWithNumbers = numbers.split(" ");
        Set<Integer> userNumbers = new HashSet<>();
        for (String number : stringWithNumbers) {
            userNumbers.add(Integer.parseInt(number));
        }
        System.out.println(userNumbers);
        assertThrows(InvalidNumbersException.class, () ->  machine.howManyWins(userNumbers));
    }

    @Test
    public void shouldReturn0WinsOrMoreIfValidNumbersAreProvided() throws InvalidNumbersException{
        Random random = new Random();
        Set<Integer> userNumbers = new HashSet<>();

        while(userNumbers.size() < 6) {
            userNumbers.add(random.nextInt(49) + 1);
        }
        int numberOfWins = machine.howManyWins(userNumbers);

        System.out.println(userNumbers);
        System.out.println("Number of wins: " + numberOfWins);

        assertTrue(numberOfWins >= 0);
    }
}