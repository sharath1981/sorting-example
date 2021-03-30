package com.kpt.dividenconquer;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int array[] = { 10, 9, 1, 5, 4, 6, 7, 8, 3, 2 };
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void sort(int[] array) {
		final var n = array.length;
		if (n < 2) {
			return;
		}
		final var mid = n / 2;

		final var leftArray = Arrays.copyOfRange(array, 0, mid);
		final var rightArray = Arrays.copyOfRange(array, mid, n);

		sort(leftArray);
		sort(rightArray);

		merge(array, leftArray, rightArray);
	}

	public static void merge(int[] array, int[] leftArray, int[] rightArray) {

		int i = 0, j = 0, k = 0;
		
		final var left = leftArray.length;
		final var right = rightArray.length;

		while (i < left && j < right) {
			array[k++] = leftArray[i] <= rightArray[j] ? leftArray[i++] : rightArray[j++];
		}
		while (i < left) {
			array[k++] = leftArray[i++];
		}
		while (j < right) {
			array[k++] = rightArray[j++];
		}
	}
}
