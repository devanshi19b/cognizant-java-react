package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J Exercise 1: Logging Error Messages and Warning Levels
 *
 * PDF Task:
 * Write a Java application that demonstrates logging error messages
 * and warning levels using SLF4J.
 *
 * PDF Step-by-Step Solution:
 * 1. Add SLF4J and Logback dependencies to pom.xml.
 * 2. Create a Java class that uses SLF4J for logging (see below).
 *
 * PDF Solution Code (exact, class renamed to match PDF):
 */
public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
