package arrays_problems;

import java.util.Arrays;

/*
 * Problem: Given a sorted array with duplicate values, 
 * remove the duplicates so each value appears only once, 
 * and return the count of unique values.
 * 
 * Constraints:
 * The array is sorted in ascending order.
 * Do the cleaning in place, with no extra array or collection (O(1) extra space).
 * Keep the unique values in their original order at the front of the array.
 * Whatever comes after the unique count doesn't matter. 
 * Aim for O(n) time.
 * */
public class RemoveDuplicates {

	public static int removeDuplicates(int[] array) {

//		Empty Array.
		if (array.length == 0) {
			return 0;
		}

		int j = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[j]) {
				continue;
			} else {
				j++;
				array[j] = array[i];
			}
		}
		return j + 1;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 2, 3 };
		System.out.println("Count of unique Elements : " + removeDuplicates(array));
	}

}
