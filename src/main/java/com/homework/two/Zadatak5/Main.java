package com.homework.two.Zadatak5;

import com.homework.two.Zadatak5.Exceptions.DimensionTooBigException;
import com.homework.two.Zadatak5.Exceptions.DimensionTooLowException;
import com.homework.two.Zadatak5.Exceptions.DivisionByZeroException;
import com.homework.two.Zadatak5.Exceptions.MonomWithSameDrgreeAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        Polinom polinom = createPolinom(10);

        addMonomToPolinom(polinom, 6, 2);
        addMonomToPolinom(polinom, -2, 3);
        addMonomToPolinom(polinom, 7.4, 0);
        addMonomToPolinom(polinom, -2.5, 6);

        polinom.display();

        try {
            double result = polinom.calculateValue(5, 20);
            System.out.println("\nResult: " + result);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
    }

    public static Polinom createPolinom(int dimension) {
        try {
            return new Polinom(dimension);
        } catch (DimensionTooBigException e) {
            try {
                return new Polinom(50);
            } catch (Exception error) {
                error.printStackTrace();
            }
        } catch (DimensionTooLowException e) {
            try {
                return new Polinom(50);
            } catch (Exception error) {
                error.printStackTrace();
            }
        }

        return null;
    }

    public static void addMonomToPolinom(Polinom polinom, double coefficient, int degree) {
        try {
            polinom.createMonom(coefficient, degree);
        } catch (MonomWithSameDrgreeAlreadyExistsException e) {
            polinom.monoms[degree].coefficient += coefficient;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
