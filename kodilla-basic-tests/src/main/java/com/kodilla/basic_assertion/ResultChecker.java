package com.kodilla.basic_assertion;

public class ResultChecker {

    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    public static void checkIfCorrect(boolean correct, int a) {
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczby: " + a);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczby: " + a);
        }
    }

    public static void checkIfCorrect(boolean correct, int a, int b) {
        if (correct) {
            System.out.println("Metoda działa poprawnie dla liczb: " + a + " i " + b);
        } else {
            System.out.println("Metoda nie działa poprawnie dla liczb: " + a + " i " + b);
        }
    }
}
