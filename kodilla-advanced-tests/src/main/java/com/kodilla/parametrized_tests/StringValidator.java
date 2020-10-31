package com.kodilla.parametrized_tests;

public class StringValidator {
    public boolean isBlanc(String text) {
        return text == null || text.trim().isEmpty();
    }
}
