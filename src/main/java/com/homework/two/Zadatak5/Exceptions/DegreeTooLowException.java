package com.homework.two.Zadatak5.Exceptions;

public class DegreeTooLowException extends Exception {
    public DegreeTooLowException() {
        super("Degree cannot be less than 1");
    }
}
