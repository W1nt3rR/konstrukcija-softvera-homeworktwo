package com.homework.two.Zadatak14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        
        Vektor vektor = new Vektor(numElements);

        for (int i = 0; i < numElements; i++) {
            vektor.setElement(i, scanner.nextInt());
        }

        System.out.println("Middle element: " + vektor.getMiddleElement());

        scanner.close();
    }
}
