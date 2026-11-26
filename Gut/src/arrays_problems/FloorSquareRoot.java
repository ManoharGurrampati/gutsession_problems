package arrays_problems;

// problem stmt : Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
//The returned integer should be non-negative as well.
public class FloorSquareRoot {

	public static int findFlooredSqrt(int x) {
		if (x == 0 || x == 1) {
			return x;
		}

		int low = 1, high = x / 2, mid, ans = 0;

		while (low <= high) {
			mid = low + (high - low) / 2;
			if (mid == x / mid) {
				return mid;
			} else if (mid < x / mid) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		int x = 8;
		System.out.println("Square root of value " + x + " : " + findFlooredSqrt(5));
	}

}
