package com.homework.two.Zadatak5.Exceptions;

public class DimensionTooBigException extends Exception {
    public DimensionTooBigException() {
        super("Dimension cannot be greater than 100");
    }
}
