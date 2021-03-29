package com.kpt.nsquare;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        final var array = new int[] { 4, 2, 3, 1, 5, 8, 7, 9,6,4,2 };
        sort(array);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
            System.out.printf("%d : %s%n", i, Arrays.toString(array));
        }
    }

    private static void swap(int[] array, int currentIndex, int minIndex) {
        final var minimum = array[minIndex];
        array[minIndex] = array[currentIndex];
        array[currentIndex] = minimum;
    }

}
