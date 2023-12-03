package com.homework.two.Zadatak5.Exceptions;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Division by zero is not allowed");
    }
}
