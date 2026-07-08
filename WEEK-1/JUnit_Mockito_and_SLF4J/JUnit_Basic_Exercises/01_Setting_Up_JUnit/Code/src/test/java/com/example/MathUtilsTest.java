package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Exercise 1: Setting Up JUnit
 *
 * PDF Steps:
 * 1. Create a new Java project in your IDE.
 * 2. Add JUnit dependency to your project (Maven pom.xml).
 * 3. Create a new test class in your project.
 */
public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, mathUtils.subtract(9, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, mathUtils.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, mathUtils.divide(5, 2), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }
}
