package com.homework.two.Zadatak14;

import java.util.Arrays;

public class Vektor {
    private int numElements;
    private int[] elements;

    public Vektor(int numElements) throws Exception {
        if (numElements <= 0) {
            throw new Exception("Number of elements must be greater than 0");
        }

        this.numElements = numElements;
        this.elements = new int[numElements];
    }

    public void setElement(int index, int value) throws Exception {
        if (index < 0 || index >= numElements) {
            throw new Exception("Index out of range");
        }

        this.elements[index] = value;
    }

    public int getMiddleElement() throws Exception {
        if (numElements % 2 == 0) {
            throw new Exception("Number of elements is even");
        }

        int[] sortedElements = elements.clone();
        Arrays.sort(sortedElements);
        
        return sortedElements[numElements / 2];
    }
}
