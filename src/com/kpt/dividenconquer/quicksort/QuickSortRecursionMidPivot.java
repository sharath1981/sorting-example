package com.kpt.dividenconquer.quicksort;

import java.util.Arrays;

public class QuickSortRecursionMidPivot {
    public static void main(String[] args) {
        int array[] = { 10, 9, 1, 2, 4, 4, 5, 7, 8, 5, 3, 2 };
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int low, int high) {

        if (array == null || array.length == 0 || low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = array[middle];
        int i = low, j = high;
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i++, j--);
            }
        }

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
