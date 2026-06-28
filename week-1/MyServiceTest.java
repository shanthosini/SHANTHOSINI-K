package com.example;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyServiceTest{

    private static final Logger logger = LoggerFactory.getLogger(MyServiceTest.class);
    private ExternalApi mockApi;
    private MyService service;

    @Before
    public void setUp(){
        mockApi=Mockito.mock(ExternalApi.class);
        service=new MyService(mockApi);
    }
    @After
    public void tearDown(){
        logger.info(" TEARDOWN: Cleaning up mock ");
    }
    @Test
    public void testExternalApi(){
        logger.info("Arrange");
        when(mockApi.getData()).thenReturn("Mock Data");

        logger.info("Act");
        String result=service.fetchData();

        logger.info("Assert");
        assertEquals("Mock Data", result);
        verify(mockApi).getData();
        logger.info("testExternalApi: result={}",result);




    }
}