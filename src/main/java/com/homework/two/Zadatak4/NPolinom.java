package com.homework.two.Zadatak4;

public class NPolinom implements IPolinom {
    private int degree;
    private double[] roots;

    public NPolinom(int degree, double[] roots) {
        this.degree = degree;
        this.roots = roots;
    }

    public double calculateValue(double x) {
        double result = 1;
        for (int i = 0; i < degree; i++) {
            result *= (x - roots[i]);
        }
        return result;
    }

    public double findRoot(double start, double end) {
        for (double root : roots) {
            if (root >= start && root <= end) {
                return root;
            }
        }
        return Double.NaN;
    }
}
