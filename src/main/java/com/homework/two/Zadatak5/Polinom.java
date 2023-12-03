package com.homework.two.Zadatak5;

import com.homework.two.Zadatak5.Exceptions.DimensionTooBigException;
import com.homework.two.Zadatak5.Exceptions.DimensionTooLowException;
import com.homework.two.Zadatak5.Exceptions.DegreeTooBigException;
import com.homework.two.Zadatak5.Exceptions.DegreeTooLowException;
import com.homework.two.Zadatak5.Exceptions.DivisionByZeroException;
import com.homework.two.Zadatak5.Exceptions.MonomWithSameDrgreeAlreadyExistsException;

public class Polinom {
    Monom[] monoms;
    int dimension;

    Polinom(int dimension) throws DimensionTooBigException, DimensionTooLowException {
        if (dimension > 100) {
            throw new DimensionTooBigException();
        } else if (dimension < 1) {
            throw new DimensionTooLowException();
        } else {
            this.dimension = dimension;
            this.monoms = new Monom[this.dimension];
        }
    }

    void createMonom(double coefficient, int degree) throws MonomWithSameDrgreeAlreadyExistsException {
        if (degree > this.dimension - 1 || degree < 0) {
            throw new IllegalArgumentException("Degree must be between 0 and " + (this.dimension - 1));
        }

        if (monoms[degree] != null && monoms[degree].degree == degree) {
            throw new MonomWithSameDrgreeAlreadyExistsException();
        } else {
            try {
                monoms[degree] = new Monom(coefficient, degree);
            } catch (DegreeTooBigException e) {
                try {
                    monoms[degree] = new Monom(coefficient, 100);
                } catch (Exception error) {
                    error.printStackTrace();
                }
            } catch (DegreeTooLowException e) {
                try {
                    monoms[degree] = new Monom(coefficient, 100);
                } catch (Exception error) {
                    error.printStackTrace();
                }
            }
        }
    }

    double calculateValue(double x, double y) throws DivisionByZeroException {
        double value = 0;

        for (Monom monom : monoms) {
            if (monom != null) {
                value += monom.calculateValue(x);
            }
        }

        if (value == 0) {
            throw new DivisionByZeroException();
        }

        return y / value;
    }

    void display() {
        for (int i = dimension - 1; i >= 0; i--) {
            if (monoms[i] != null) {
                monoms[i].display();
            }
        }
    }
}
