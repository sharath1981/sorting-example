package com.kpt.nsquare;

import java.util.Arrays;

public class NSquareSort {
    public static void main(String[] args) {

        int array[] = { 10, 9, 1, 2, 4, 4, 5, 7, 8, 5, 3, 2 };

        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        // insertionSort1(array);
        insertionSort2(array);

    }

    private static void insertionSort2(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j >= 0 && array[j] > array[j + 1]; j--) {
                int minimum = array[j + 1];
                array[j + 1] = array[j];
                array[j] = minimum;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static void insertionSort1(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0 && array[j - 1] > array[j]; j--) {
                int minimum = array[j];
                array[j] = array[j - 1];
                array[j - 1] = minimum;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static void insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int minimum = array[j];
                array[j] = array[j - 1];
                array[j - 1] = minimum;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int minimum = array[minIndex];
            array[minIndex] = array[i];
            array[i] = minimum;
            System.out.println(Arrays.toString(array));
        }
    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int greater = array[i];
                    array[i] = array[j];
                    array[j] = greater;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
