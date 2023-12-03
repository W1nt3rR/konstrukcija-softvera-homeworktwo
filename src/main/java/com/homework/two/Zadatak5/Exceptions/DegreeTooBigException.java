package com.homework.two.Zadatak5.Exceptions;

public class DegreeTooBigException extends Exception {
    public DegreeTooBigException() {
        super("Degree cannot be greater than 100");
    }
}
