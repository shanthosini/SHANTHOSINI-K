package com.example;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AAAPatternTest{
    private static final Logger logger = LoggerFactory.getLogger(AAAPatternTest.class);
    private Calculator calculator;

    @Before
    public void setUp(){
        logger.info("Creating calculator instance");
        calculator=new Calculator();

    }
    @After
    public void tearDown(){
        logger.info("TearDown after test finishes, cleaning up");
        calculator=null;
    }
    @Test
    public void testAdd(){
        logger.info("Arrange : setting the values");
        int a=10;
        int b=5;

        logger.info("Act : call calculator.add()");
        int result = calculator.add(a,b);

        logger.info("Assert : checking result");
        assertEquals(15,result);
        logger.info("testAdd AAA: {} + {} = {}",a,b,result);
    }
    @Test
    public void testDivide(){
        logger.info("Arrange : setting values");
        int a=20;
        int b=4;

        logger.info("Act : calculator.divide()");
        int result=calculator.divide(a,b);

        logger.info("Assert : checking result");
        assertEquals(5,result);
        logger.info("testDivide AAA passed: {} / {} = {}", a, b, result);

    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){

        logger.info("Arrange : values");
        int a=10;
        int b=0;

        logger.info("Act :  calling calculator.divide()");
        calculator.divide(a,b);
        //assert handled by @test exception
    }
}