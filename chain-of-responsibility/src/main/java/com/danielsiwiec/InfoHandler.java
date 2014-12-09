package com.danielsiwiec;

public class InfoHandler extends LogHandler {


    @Override
    protected void printMessage(String message) {
        if (message.startsWith("INFO")){
            System.out.println(message);
        }
    }
}
