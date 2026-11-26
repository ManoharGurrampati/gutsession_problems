package arrays_problems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_UnsortedArray {

	public static int[] findTwoSum(int[] array, int target) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int compliment;

		for (int i = 0; i < array.length; i++) {

			compliment = target - array[i];
//			conatainsKey returns boolean values for checking that given key is present in the map or not.
			if (map.containsKey(compliment)) {
//			map.get(key) takes key as the input and returns int which is value in key-value pair.
				return new int[] { map.get(compliment), i };
			}

			map.put(array[i], i);
		}

		return new int[] {};
	}

	public static void main(String[] args) {
		int[] array = { 3, 3, 3 };
		int target = 6;
		int[] result = findTwoSum(array, target);
		if (result.length != 0) {
			System.out.println(Arrays.toString(result));
		} else {
			System.out.println("Pair not found!");
		}
	}

}
