package search_sort_algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] array = { 35, 27, 43, 3, 9, 10 };
		divideArray(array);
		System.out.println("After Sorting : " + Arrays.toString(array));
	}

	public static void divideArray(int[] array) {
//		Base condition.
		if (array.length == 1) {
			return;
		}
		int[] left = new int[array.length / 2]; // left array
		int[] right = new int[array.length - left.length]; // Right Array
//		fill the left and right array
		int i;
		for (i = 0; i < left.length; i++) {
			left[i] = array[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = array[i++];
		}
//		Recursive method call.
		divideArray(left);
		divideArray(right);
		mergeArray(left, right, array);
	}

	public static void mergeArray(int[] left, int[] right, int[] array) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
//			put the smallest element in base array
			if (left[i] < right[j]) {
				array[k++] = left[i++];
			}
//			Put the largest element in the base array.
			else {
				array[k++] = right[j++];
			}
		}
//		fill the base array with remaining elements in left array.
		while (i < left.length) {
			array[k++] = left[i++];
		}
//		fill the base array with remaining elements in rigth array.
		while (j < right.length) {
			array[k++] = right[j++];
		}
	}

}
