package com.danielsiwiec;

public class ErrorHandler extends LogHandler {


    @Override
    protected void printMessage(String message) {
        if (message.startsWith("ERROR")){
            System.out.println("---ERROR ENCOUNTERED---");
            System.out.println(message);
            System.out.println("-----------END---------");
        }
    }
}
