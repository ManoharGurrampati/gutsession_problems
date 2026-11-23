package search_sort_algorithms;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int[] array) {
//		 Start from the second element: Assume the first element (index 0) is already a sorted list of size 1.
		for (int i = 1; i < array.length; i++) {
//			 Pick the next element (key): Store the value of the current element you want to insert.
			int key = array[i];
			int j = i - 1;
//			 Shift larger elements right: Compare the key with the elements to its left. 
			while (j >= 0 && array[j] > key) {
//				 Move any element greater than the key one position to the right to make room.
				array[j + 1] = array[j];
				j--;
			}
//			 Insert the key: Drop the key into the empty spot left behind
			array[j + 1] = key;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = { 2, 6, 8, 1, 4, 3, 5 };
		System.out.println("Before Sorting : " + Arrays.toString(array));
		System.out.println("After Sorting : " + Arrays.toString(insertionSort(array)));
	}

}
