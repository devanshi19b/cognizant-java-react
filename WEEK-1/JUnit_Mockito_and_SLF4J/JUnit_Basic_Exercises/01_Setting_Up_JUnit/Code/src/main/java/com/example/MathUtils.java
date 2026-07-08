package com.example;

/**
 * Exercise 1: Setting Up JUnit
 *
 * A simple MathUtils class whose methods will be tested
 * to demonstrate JUnit 5 project setup.
 */
public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
