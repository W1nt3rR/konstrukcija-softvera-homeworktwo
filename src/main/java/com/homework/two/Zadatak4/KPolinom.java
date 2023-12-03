package com.homework.two.Zadatak4;

public class KPolinom implements IPolinom {
    public int degree;
    public double[] coefficients;

    public KPolinom(int degree, double[] coefficients) {
        this.degree = degree;
        this.coefficients = coefficients;
    }

    public double calculateValue(double x) {
        double result = coefficients[0];
        for (int i = 1; i <= degree; i++) {
            result = result * x + coefficients[i];
        }
        return result;
    }

    public double findRoot(double start, double end) {
        double mid = 0;
        while (end - start > 0.0001) {
            mid = (start + end) / 2;
            if (calculateValue(mid) == 0.0) {
                break;
            } else if (calculateValue(start) * calculateValue(mid) < 0) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return mid;
    }
}
