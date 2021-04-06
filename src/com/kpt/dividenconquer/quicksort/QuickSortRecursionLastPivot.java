package com.kpt.dividenconquer.quicksort;

import java.util.Arrays;

public class QuickSortRecursionLastPivot {

    public static void main(String[] args) {
        int[] array = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };

        sort(array, 0, array.length - 1);

        // print the sorted array
        System.out.println(Arrays.toString(array));
    }

    // Quicksort routine
    public static void sort(int[] array, int start, int end) {
        // base condition
        if (start >= end) {
            return;
        }

        // rearrange elements across pivot
        int pivot = partition(array, start, end);

        // recur on subarray containing elements less than the pivot
        sort(array, start, pivot - 1);

        // recur on subarray containing elements more than the pivot
        sort(array, pivot + 1, end);
    }

    // Partition using the Lomuto partition scheme
    public static int partition(int[] array, int start, int end) {
        // Pick the rightmost element as a pivot from the array
        int pivot = array[end];

        // elements less than the pivot will be pushed to the left of `pIndex`
        // elements more than the pivot will be pushed to the right of `pIndex`
        // equal elements can go either way
        int pIndex = start;

        // each time we find an element less than or equal to the pivot,
        // `pIndex` is incremented, and that element would be placed
        // before the pivot.
        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }

        // swap `pIndex` with pivot
        swap(array, end, pIndex);

        // return `pIndex` (index of the pivot element)
        return pIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
