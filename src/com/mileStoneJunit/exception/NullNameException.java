package com.mileStoneJunit.exception;

public class NullNameException extends Exception {

    public NullNameException() {
        super("Student name is null");
    }
}