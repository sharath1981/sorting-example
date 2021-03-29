package com.kpt.nsquare;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) throws Exception {
        final var array = new int[] { 3, 4, 2, 1, 5, 9, 6, 7, 8, 3 };
        sort(array);
    }

    private static void sort(final int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("----------------------------------------------");
            System.out.println("Iteration : " + i);
            System.out.println("----------------------------------------------");
            for (int j = i + 1; j < array.length; j++) {
                compareAndSwap(array, i, j);
                System.out.printf("%d : %s%n", j, Arrays.toString(array));
            }
        }
    }

    private static void compareAndSwap(int[] array, int i, int j) {
        if (array[i] > array[j]) {
            final var greater = array[i];
            array[i] = array[j];
            array[j] = greater;
        }
    }

}
