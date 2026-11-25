package arrays_problems;

import java.util.Arrays;

public class FirstAndLastPosition_SortedArray {

	public static int[] findTargetIndex(int[] array, int target) {

		if (array.length == 0) {
			return new int[] { -1, -1 };
		}

		int low = 0, high = array.length - 1, mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] == target) {
				int prevIndex = mid - 1;
				if (prevIndex >= 0 && array[prevIndex] == target) {
					return new int[] { prevIndex, mid };
				} else {
					return new int[] { mid, mid };
				}
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		int[] array = { 10 };
		int target = 10;
		System.out.println(Arrays.toString(findTargetIndex(array, target)));

	}

}
