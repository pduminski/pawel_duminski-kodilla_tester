package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int result = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, result);

        ResultChecker.checkIfCorrect(correct, a, b);

        a = 10;
        b = 5;
        result = calculator.subtract(a, b);
        correct = ResultChecker.assertEquals(5, result);

        ResultChecker.checkIfCorrect(correct, a, b);

        a = 3;
        result = calculator.squared(a);
        correct = ResultChecker.assertEquals(9, result);

        ResultChecker.checkIfCorrect(correct, a);
    }
}
