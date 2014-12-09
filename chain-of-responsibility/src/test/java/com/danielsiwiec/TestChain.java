package com.danielsiwiec;

import org.junit.Test;

public class TestChain {

    @Test
    public void testChain(){
        LogHandler logHandler = new ErrorHandler().withHandler(new InfoHandler()).withHandler(new TraceHandler());
        System.out.println(logHandler.getClass());
        System.out.println("MESSAGE 1: INFO");
        logHandler.handleLogMessage("INFO: Clear for take off");
        System.out.println("MESSAGE 2: TRACE");
        logHandler.handleLogMessage("TRACE: Button pushed");
        System.out.println("MESSAGE 3: ERROR");
        logHandler.handleLogMessage("ERROR: Huston, we have a problem");
        System.out.println("MESSAGE 4: UNHANDLED");
        logHandler.handleLogMessage("WARN: Low on oxygen. Do you read me?");
    }
}
