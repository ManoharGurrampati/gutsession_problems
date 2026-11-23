package search_sort_algorithms;

public class SearchingProblems {

//	Linear Search
	public static int findTargetIndex(int[] array, int target) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return index;
	}
	
//   Binary Search
	public static int findTargetIndexWithBinary(int[] array, int target) {
		int index = -1;
		int first = 0, last = array.length - 1, mid = 0;
		while (first < last) {
			mid = (first + last) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 20, 30 };
		int target = 20;
//		int index = findTargetIndex(array, target);
//		if (index >= 0) {
//			System.out.println("Target found at index : " + index);
//		} else {
//			System.out.println("Target element not found!!");
//		}

		int targetIndex = findTargetIndexWithBinary(array, target);
		if (targetIndex >= 0) {
			System.out.println("Target found at index : " + targetIndex);
		} else {
			System.out.println("Target element not found!!");
		}

	}

}
