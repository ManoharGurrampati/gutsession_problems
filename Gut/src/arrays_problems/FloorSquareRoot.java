package arrays_problems;

// problem stmt : Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
//The returned integer should be non-negative as well.
public class FloorSquareRoot {

	public static int findFlooredSqrt(int x) {
		int sqrtvalue = 0;
		if (x == 0 || x == 1) {
			return x;
		}

		for (int i = 1; i <= x; i++) {
			if (i * i == x) {
				sqrtvalue = i;
				break;
			} else if (i * i > x) {
				sqrtvalue = i - 1;
				break;
			}
		}

		return sqrtvalue;
	}

	public static void main(String[] args) {
		int x = 5;
		System.out.println("Square root of value " + x + " : " + findFlooredSqrt(5));
	}

}
