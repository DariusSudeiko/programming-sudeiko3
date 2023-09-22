package ua.khpi.oop.darius.task03;

// task 2,3

import java.util.Random;

public class Marray {
	public static void main(String[] args) {
		// array1(5,3,9);
		array2(5);
	}

	public static void array1(int M, int low, int high) {
		int[] values = new Random().ints(M, low, high).toArray();

		for (int i = 0; i < values.length; ++i) {
			System.out.println(values[i]);
		}
	}

	public static void array2(int N) {
		int[] values = new int[N];
		int sum = 0;
		int neg = 0;
		int pos = 0;
		double sqrsum = 0;
		Random rand = new Random();
		for (int i = 0; i < N; ++i) {
			// Generate a random integer between -10 and 10
			values[i] = rand.nextInt(21) - 10;
			System.out.println(values[i]);
			if (values[i] < 0) {
				neg += values[i];
			} else if (values[i] > 0) {
				pos += values[i];
			}
			if (values[i] > 0) {
				sqrsum += Math.sqrt(values[i]);
			}
			sum += values[i];
		}
		System.out.println("sum of all " + sum);
		System.out.println("sum of negatives " + neg);
		System.out.println("sum of positives " + pos);
		System.out.println("sum of square roots " + sqrsum);
	}
}
