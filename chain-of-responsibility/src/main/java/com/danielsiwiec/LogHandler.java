package com.danielsiwiec;

public abstract class LogHandler {

    private LogHandler nextHandler;

    public LogHandler withHandler(LogHandler nextHandler){
        nextHandler.nextHandler = this;
        return nextHandler;
    }

    public void handleLogMessage(String message) {
        printMessage(message);
        if (nextHandler != null){
            nextHandler.handleLogMessage(message);
        }
    }

    protected abstract void printMessage(String message);
}
