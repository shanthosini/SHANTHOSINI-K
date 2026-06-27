package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorTest.class);
    private Calculator calculator;

    @Before
    public void setUp() {
        logger.info("Setting up Calculator instance before each test");
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        logger.info("Running testAdd");
        int result = calculator.add(3, 5);
        assertEquals(8, result);
        logger.info("testAdd passed: 3 + 5 = {}", result);
    }

    @Test
    public void testDivide() {
        logger.info("Running testDivide");
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
        logger.info("testDivide passed: 10 / 2 = {}", result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        logger.warn("Testing divide by zero — expecting exception");
        calculator.divide(10, 0);
    }
}