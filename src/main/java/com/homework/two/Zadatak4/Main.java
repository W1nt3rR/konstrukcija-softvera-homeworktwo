package com.homework.two.Zadatak4;

public class Main {
    public static void main(String[] args) {
        IPolinom kPolinom = new KPolinom(2, new double[]{-1, 0, 1});
        System.out.println(kPolinom.calculateValue(2));
        System.out.println(kPolinom.findRoot(-2, 2));

        IPolinom nPolinom = new NPolinom(2, new double[]{1, -1});
        System.out.println(nPolinom.calculateValue(2));
        System.out.println(nPolinom.findRoot(-2, 2));
    }
}