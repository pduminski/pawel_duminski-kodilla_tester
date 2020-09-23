package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 11;
        int b = 5;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(6, subtractResult);
    }

    @Test
    public void testSquaredPositiveInt() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult);
    }

    @Test
    public void testSquaredNegativeInt() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult);
    }

    @Test
    public void testSquaredForZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squaredResult = calculator.squared(a);
        assertEquals(0, squaredResult);
    }
}
