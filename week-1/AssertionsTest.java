package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssertionsTest{
    private static final Logger logger = LoggerFactory.getLogger(AssertionsTest.class);

    @Test
    public void testAssertions(){
        assertEquals(5,2+3);
        logger.info("assertEquals passed");

        assertTrue(5>3);
        logger.info("assertTrue passed");

        assertFalse(5<3);
        logger.info("assertFalse passed");

        assertNull(null);
        logger.info("assertNull passed");

        assertNotNull(new Object());
        logger.info("assertNotNull passed");

    }

}
