package com.kpt.dividenconquer;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int array[] = { 10, 9, 1, 2, 4, 4, 5, 7, 8, 5, 3, 2 };
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int low, int high) {
        // check for empty or null array
        if (array == null || array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        // Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            // Check until all values on left side array are lower than pivot
            while (array[i] < pivot) {
                i++;
            }
            // Check until all values on right side array are greater than pivot
            while (array[j] > pivot) {
                j--;
            }
            // Now compare values from both side of lists to see if they need swapping
            // After swapping move the iterator on both lists
            if (i <= j) {
                swap(array, i++, j--);
            }
        }
        // Do same operation as above recursively to sort two sub arrays
        if (low < j) {
            sort(array, low, j);
        }
        if (high > i) {
            sort(array, i, high);
        }
    }

    public static void swap(int array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
