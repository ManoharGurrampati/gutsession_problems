package search_sort_algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 35, 27, 43, 3, 9, 10 };

		System.out.println("Before Sorting : " + Arrays.toString(array));
		divideArray(array);
		System.out.println("After Sorting : " + Arrays.toString(array));
	}

	public static void divideArray(int[] array) {

		if (array.length == 1) {
			return;
		}

		int[] left = new int[array.length / 2];
		int[] right = new int[array.length - left.length];

		int i;
		for (i = 0; i < left.length; i++) {
			left[i] = array[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = array[i++];
		}

		divideArray(left);

		divideArray(right);

		mergeArray(left, right, array);
	}

	public static void mergeArray(int[] left, int[] right, int[] array) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				array[k] = left[i];
				k++;
				i++;
			} else {
				array[k] = right[j];
				k++;
				j++;
			}
		}

		while (i < left.length) {
			array[k++] = left[i++];
		}

		while (j < right.length) {
			array[k++] = right[j++];
		}
	}

}
