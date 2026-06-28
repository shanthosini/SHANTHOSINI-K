package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService{

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi){
        this.externalApi=externalApi;
    }
    public String fetchData(){
        String data = externalApi.getData();
        logger.info(" Data received : {} ", data);
        return data;
    }
}