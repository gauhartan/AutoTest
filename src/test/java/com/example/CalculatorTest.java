package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @ParameterizedTest

    @CsvSource({
            "3, 5, 8",
            "0, 0, 0",
            "2, -1, 1",
            "-1, -1, -2"
    }
    )
    void canAdd(int a, int b, int expected) {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(a, b);

        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest

    @CsvSource({
            "5, 2, 3",
            "4, 0, 4",
            "10, -1, 11",
            "-1, -1, 0"
    }
    )
    void canSub(int a, int b, int expected) {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.subtract(a, b);

        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest

    @CsvSource({
            "5, 2, 10",
            "4, 0, 0",
            "10, -1, -10",
            "-1, -1, 1"
    }
    )
    void canMult(int a, int b, int expected) {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.multiply(a, b);

        //then
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "4, 1, 4",
            "10, -1, -10",
            "-1, -1, 1"
    }
    )
    void canDiv(int a, int b, int expected) {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.divide(a, b);

        //then
        assertEquals(expected, result);
    }
}