package arrays_problems;

import java.util.Arrays;

public class FirstAndLastPosition_SortedArray {

	public static int[] findTargetIndex(int[] array, int target) {
		int first = findBound(array, target, true);
		// If the target doesn't exist at all, no need to run the second search
		if (first == -1) {
			return new int[] { -1, -1 };
		}
		int last = findBound(array, target, false);
		return new int[] { first, last };
	}

	private static int findBound(int[] array, int target, boolean isFirst) {
		int low = 0, high = array.length - 1;
		int bound = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] == target) {
				bound = mid;
				if (isFirst) {
					high = mid - 1; // Keep looking left for first position
				} else {
					low = mid + 1; // Keep looking right for last position
				}
			} else if (array[mid] > target) {
				high = mid - 1;
			} else 
				low = mid + 1;
		}
		return bound;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 4 };
		int target = 3;
		System.out.println(Arrays.toString(findTargetIndex(array, target)));
	} }