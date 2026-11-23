package search_sort_algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] array) {
		int temp;
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			boolean status = false;
			for (int j = 0; j < array.length - i - 1; j++) {
//				use < for Descending Order. || > for Ascending Order.
				if (array[j] > array[j + 1]) {
					status = true;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					count++;
				}
			}
			if (!status) {
				break;
			}
		}
		System.out.println("No.of swaps used to sort the given array : " + count);

		return array;
	}

	public static void main(String[] args) {
		int[] array = { 2, 6, 8, 1, 4, 3, 5 };
		System.out.println("Before Sorting : " + Arrays.toString(array));
		System.out.println("After Sorting : " + Arrays.toString(bubbleSort(array)));
	}

}
