package ua.khpi.oop.darius.task04;

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		System.out.println("Begin...");
		// Use the following VM arguments: -enable assertions
		{
			int x = 3;
			int y = 2;
			int expected = 9;
			int actual = One.power(x, y);
			// Is the 'expected' equal to the 'actual'?
			assert expected == actual : "expected = " + expected + " but actual = " + actual;
		}
		{
			A actual = new A();
			actual.x = 3;
			int y = 2;
			int expected = 9;
			One.power(actual, y);
			// Is the 'expected' equal to the 'actual.x'?
			assert expected == actual.x : "expected = " + expected + " but actual = " + actual.x;
		}
		{
			int[] actual = { 1, 2, 3, 4, 5 };
			int y = 2;
			int[] expected = { 1, 4, 9, 16, 25 };
			One.power(actual, y);
			// Is the 'expected' equal to the 'actual'?
			assert Arrays.equals(expected, actual) : "expected = " + Arrays.toString(expected) + " but actual = "
					+ Arrays.toString(actual);
		}
		System.out.println("Done.");
	}
}
