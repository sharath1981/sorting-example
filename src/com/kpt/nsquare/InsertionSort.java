package com.kpt.nsquare;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        final var array = new int[] { 6, 5, 7, 3, 8, 2, 1, 9, 4 };
        sort(array);
    }

    private static void sort(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                swap(array, j);
            }
            System.out.printf("%d : %s%n", i, Arrays.toString(array));
        }
    }

    private static void swap(final int[] array, int j) {
        final var minimum = array[j];
        array[j] = array[j - 1];
        array[j - 1] = minimum;
    }
}
