package com.kpt.dividenconquer.quicksort;

import java.util.Arrays;

public class QuickSortRecursionLastPivot {
    public static void main(String[] args) {
        int[] array = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array, int start, int end) {

        if (start >= end) {
            return;
        }

        int pivot = partition(array, start, end);

        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, pIndex++);
            }
        }

        swap(array, end, pIndex);
        return pIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
