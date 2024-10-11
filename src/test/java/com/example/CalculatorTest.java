package com.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void canAdd() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.add(2, 5);
        int result2 = calc.add(-3, 5);
        int result3 = calc.add(4, -5);

        //then
        assertAll(() -> assertEquals(7, result),
                () -> assertEquals(2, result2),
                () -> assertEquals(-1, result3)
        );
    }

    @org.junit.jupiter.api.Test
    void canSub() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.subtract(2, 5);
        int result2 = calc.subtract(-3, 5);
        int result3 = calc.subtract(4, -5);

        //then
        assertAll(() -> assertEquals(-3, result),
                () -> assertEquals(-8, result2),
                () -> assertEquals(9, result3)
        );
    }

    @org.junit.jupiter.api.Test
    void canMult() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.multiply(2, 5);
        int result2 = calc.multiply(-3, 5);
        int result3 = calc.multiply(4, -5);

        //then
        assertAll(() -> assertEquals(10, result),
                () -> assertEquals(-15, result2),
                () -> assertEquals(-20, result3)
        );
    }

    @org.junit.jupiter.api.Test
    void canDiv() {
        //given
        Calculator calc = new Calculator();

        //when
        int result = calc.divide(10, 5);
        int result2 = calc.divide(-5, 5);
        int result3 = calc.divide(-20, -5);

        //then
        assertAll(() -> assertEquals(2, result),
                () -> assertEquals(-1, result2),
                () -> assertEquals(4, result3)
        );
    }
}