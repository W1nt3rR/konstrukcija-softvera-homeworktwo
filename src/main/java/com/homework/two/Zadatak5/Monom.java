package com.homework.two.Zadatak5;

import com.homework.two.Zadatak5.Exceptions.DegreeTooBigException;
import com.homework.two.Zadatak5.Exceptions.DegreeTooLowException;
import com.homework.two.Zadatak5.Exceptions.DregreesAreDifferentException;

public class Monom {
    double coefficient;
    int degree;

    Monom(double coefficient, int degree) throws DegreeTooBigException, DegreeTooLowException {
        this.coefficient = coefficient;

        if (degree > 100) {
            throw new DegreeTooBigException();
        } else if (degree < 0) {
            throw new DegreeTooLowException();
        } else {
            this.degree = degree;
        }
    }

    double calculateValue(double x) {
        return coefficient * Math.pow(x, degree);
    }

    void compare(Monom other) throws DregreesAreDifferentException {
        if (this.degree != other.degree) {
            throw new DregreesAreDifferentException();
        }
    }

    void display() {
        String sign = (coefficient >= 0) ? "+" : "";
        String term = (degree == 0) ? "" : "x";
        String exponent = (degree <= 1) ? "" : "^" + degree;
        
        System.out.print(sign + coefficient + term + exponent);
    }
}
