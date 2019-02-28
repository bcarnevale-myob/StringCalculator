package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator calculator = new StringCalculator();

    @Test
    public void addEmptyStringReturnZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void addNumericalStringReturnThatNumber() {
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("3"));
    }

    @Test
    public void addTwoNumbersReturnSumOfTwoNumbers() {
        assertEquals(3, calculator.add("1,2"));
        assertEquals(8, calculator.add("3,5"));
    }

    @Test
    public void addHandlesTrailingWhiteSpace() {
        assertEquals(5, calculator.add("1,4 "));
    }

    @Test
    public void addAnyAmountOfNumbersReturnSumOfNumber() {
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(20, calculator.add("3,5,3,9"));
    }

    @Test
    public void addLineBreaksAndCommasInterchangeableBetweenNumbers() {
        assertEquals(6, calculator.add("1,2\n3"));
        assertEquals(20, calculator.add("3\n5\n3,9"));
    }

    @Test
    public void addSupportDifferentDelimiters() {
        assertEquals(3, calculator.add("//;\n1;2"));
    }

}