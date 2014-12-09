package com.danielsiwiec;

public class TraceHandler extends LogHandler {

    @Override
    protected void printMessage(String message) {
        if (message.startsWith("TRACE")) {
            System.out.println("TRACE:" + message);
        }
    }
}
