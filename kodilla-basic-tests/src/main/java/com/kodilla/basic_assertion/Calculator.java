package com.kodilla.basic_assertion;

import java.math.MathContext;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int squared(int a) {
        return (int) Math.pow(a, 2);
//        return a * a;
    }
}

