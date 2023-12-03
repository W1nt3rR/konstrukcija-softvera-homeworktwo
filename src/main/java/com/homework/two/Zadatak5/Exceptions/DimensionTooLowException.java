package com.homework.two.Zadatak5.Exceptions;

public class DimensionTooLowException extends Exception {
    public DimensionTooLowException() {
        super("Dimension cannot be lower than 0");
    }
}
