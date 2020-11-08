package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonBMISource {

    static Stream<Arguments> providePeopleWithCertainBMIForTesting() {
        return Stream.of(
                Arguments.of("Very severely underweight", 1.83, 50.00),
                Arguments.of("Severely underweight", 1.83, 53.00),
                Arguments.of("Underweight", 1.83, 61.00),
                Arguments.of("Normal (healthy weight)", 1.80, 75.00),
                Arguments.of("Overweight", 1.83, 85.50),
                Arguments.of("Obese Class I (Moderately obese)", 1.83, 100.50),
                Arguments.of("Obese Class II (Severely obese)", 1.83, 130.00),
                Arguments.of("Obese Class III (Very severely obese)", 1.83, 140.00),
                Arguments.of("Obese Class IV (Morbidly Obese)", 1.83, 165.00),
                Arguments.of("Obese Class V (Super Obese)", 1.83, 200.00),
                Arguments.of("Obese Class VI (Hyper Obese)", 1.83, 300.00)
        );
    }
}
