package arrays_problems;

public class SecondLargestElement {

	public static void findSecondLargestElement(int[] array) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] != largest) {
				secondLargest = array[i];
			}
		}

		System.out.println("Largest Element : " + largest);
		System.out.println("Second Largest Element : " + secondLargest);
	}

	public static void main(String[] args) {
		int[] array = { 2, 12, 5, 8, 4, 9 };
		findSecondLargestElement(array);
	}

}
