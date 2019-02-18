package com.brijesh.exception;

public class CollegeException extends Throwable {

    public CollegeException(String msg) {
        super(msg);
    }

    public CollegeException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
