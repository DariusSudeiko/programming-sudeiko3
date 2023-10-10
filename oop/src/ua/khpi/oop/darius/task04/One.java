package ua.khpi.oop.darius.task04;

public class One {
	// Task 1
	static int square(int x) {
		return x * x;
	}

	// Task 2
	public static int power(int x, int y) {
		int sum = x;
		for (int i = 1; i < y; ++i) {
			sum *= x;
		}
		return sum;
	}

	// Task 3
	public static void power(A a, int y) {
		int sum = a.x;
		for (int i = 1; i < y; ++i) {
			sum *= a.x;
		}
		a.x=sum;
		// Raise 'a.x' to the 'y'th power.
	}

	// Task 4
	public static void power(int[] array, int y) {
		for (int i = 0; i < array.length; ++i) {
			int sum = array[i];
			for (int j = 1; j < y; ++j) {
				sum *= array[i];
			}
			array[i] = sum;
		}
		// Raise each element of an array to the 'y'th power.
	}

}
