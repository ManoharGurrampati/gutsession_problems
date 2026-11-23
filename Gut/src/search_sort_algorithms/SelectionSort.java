package search_sort_algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int[] array) {
		int minIndex = -1;
		int temp = 0;
		int count = 0;

		for (int i = 0; i < array.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
				count++;
			}
		}
		System.out.println("No.of swaps used to sort the given array : " + count);
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 2, 6, 8, 1, 4, 3, 5 };
		System.out.println("Before Sorting : " + Arrays.toString(array));
		System.out.println("After Sorting : " + Arrays.toString(selectionSort(array)));
	}

}
