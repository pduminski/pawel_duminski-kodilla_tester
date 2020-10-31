package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"tasterskiziom", "TaSTERSKIZIOM", "Tasterskiz", "123456789", "1Tasterski9",
            "taster_TESTERZKI", "TASTER12-testerzki"})
    public void shouldReturnTrueIfUsernameRegexIsCorrect(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"te", "tester#thebest", "test123!", "me>you"})
    public void shouldReturnFalseIfUsernameRegexIsNotCorrect(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tester@test.com", "tasterz09_BOT@test-testo.com", "tester.testerski-BOT@best60.de",
            "tester_BOT@test.testo.tester"})
    public void shouldReturnTrueIfEmailRegexIsCorrect(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@test.toolong", "test#com.pl", "test@test!com", "test@test.te60"})
    public void shouldReturnFalseIfEmailRegexIsNotCorrect(String email) {
        assertFalse(validator.validateEmail(email));
    }
}