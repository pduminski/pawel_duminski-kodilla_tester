package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTestSuite {

    private NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldReturnTrueIfNumberEqualsThree() {
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

}