package com.homework.two.Zadatak5.Exceptions;

public class MonomWithSameDrgreeAlreadyExistsException extends Exception {
    public MonomWithSameDrgreeAlreadyExistsException() {
        super("Monom with same degree already exists");
    }
}
