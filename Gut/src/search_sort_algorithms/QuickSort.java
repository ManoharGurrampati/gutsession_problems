package search_sort_algorithms;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[] array, int low, int high) {
//		base condition.
		if (low >= high) {
			return;
		}
		int i = low, j = high, pivot = low, temp;

//		Partioning the array -> left subArray contains elements < pivot element & right sub array contains elements > pivot element.
		while (i < j) {
			while (array[i] <= array[pivot] && i < high) {
				i++;
			}
			while (array[j] > array[pivot]) {
				j--;
			}
			if (i < j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		temp = array[j];
		array[j] = array[pivot];
		array[pivot] = temp;
//		recursive call
		quickSort(array, low, j - 1);
		quickSort(array, j + 1, high);
	}

	public static void main(String[] args) {
		int[] array = { 50, 10, 30, 60, 80, 20, 90 };
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
}
