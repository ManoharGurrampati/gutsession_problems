package arrays_problems;

public class ThirdLargestElement {

	public static void findThirdLargestElement(int[] array) {
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, thirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] != largest) {
				thirdLargest = secondLargest;
				secondLargest = array[i];
			} else if (array[i] > thirdLargest && array[i] != largest && array[i] != secondLargest) {
				thirdLargest = array[i];
			}
		}

		System.out.println("Largest Element : " + largest);
		System.out.println("Second Largest Element : " + secondLargest);
		System.out.println("Third Largest Element : " + thirdLargest);
	}

	public static void main(String[] args) {
		int[] array = { 2, 12, 12, 4, 9 };
		findThirdLargestElement(array);
	}

}
