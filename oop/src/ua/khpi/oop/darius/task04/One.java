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
		a.x= power(a.x,y);
	}

	// Task 4
	public static void power(int[] array, int y) {
		for (int i = 0; i < array.length; ++i) {
			array[i] = power(array[i],y);
		}
		// Raise each element of an array to the 'y'th power.
	}

}
