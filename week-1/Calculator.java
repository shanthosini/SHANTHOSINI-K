package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Adding {} + {}", a, b);
        int result = a + b;
        logger.debug("Result of add: {}", result);
        return result;
    }

    public int divide(int a, int b) {
        logger.info("Dividing {} / {}", a, b);
        if (b == 0) {
            logger.error("Division by zero attempted!");
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}