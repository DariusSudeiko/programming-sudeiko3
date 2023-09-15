package ua.khpi.oop.Darius.task02;

public class ArrayEx {
	public static void main(String[] args) {
		double[] numbers = { 1.1, 2.2, 3.3 };
		System.out.print("Array: ");
		printArray(numbers);
		System.out.println();
		System.out.println("calcSum1(): " + calcSum1(numbers));
		System.out.println("calcSum2(): " + calcSum2(numbers));
		System.out.println("calcSum3(): " + calcSum3(numbers));
		System.out.println("calcSum4(): " + calcSum4(numbers));
		System.out.println("Average of {1.1,2.2,3.3} = " + calcAverage(numbers));
		System.out.println("Number positive = " + numPositive(numbers));
		double[] numbersWithNegative = { 1.1, 2.2, 3.3, -1, -2 };
		System.out.print("Array: ");
		printArray(numbersWithNegative);
		System.out.println();
		System.out.println("Number positive = " + numPositive(numbersWithNegative));
		double[] moreNumbers = { 1.1, 2.2, 3.3, -1, -2, 4 };
		System.out.print("Array: ");
		printArray(moreNumbers);
		System.out.println();
		System.out.println("Number positive = " + numPositive(moreNumbers));
		System.out.print("Array: ");
		printArray(numbers);
		System.out.println();
		System.out.println("Number from 1.1 to 3.2 = " + numInRange(numbers, 1.0, 3.1));
	}

	public static int numInRange(double[] nums, double lowerBound, double upperBound) {
		// TODO: Return the count of how many of the array entries are between the two
		// bounds, inclusive.
		int sum = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] >= lowerBound && nums[i] <= upperBound) {
				sum += 1;
			}
		}
		return sum;
	}

	public static void printArray(double[] numbers) {
		// TODO: Print each element of the array as follows: {numbers[0], numbers[1],
		// ...}.
		System.out.print("{");
		for (int i = 0; i < numbers.length; ++i) {
			if (numbers[i] != numbers[numbers.length - 1]) {
				System.out.print(numbers[i]);
				System.out.print(", ");
			} else {
				System.out.print(numbers[i]);
			}

		}
		System.out.print('}');
	}

	public static double calcAverage(double[] numbers) {
		// TODO: Return the average value of 'numbers'.
		return calcSum1(numbers) / numbers.length;

	}

	public static int numPositive(double[] numbers) {
		// TODO: Return the count of how many of the array entries are greater than or
		// equal to zero.
		int sum = 0;
		for (int i = 0; i < numbers.length; ++i) {
			if (numbers[i] > 0) {
				sum += 1;
			}
		}

		return sum;
	}

	public static double calcSum1(double[] numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum = sum + num; // Or sum += num
		}
		return sum;
	}

	public static double calcSum2(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; ++i) {
			sum = sum + numbers[i];
		}
		return sum;
	}

	public static double calcSum3(double[] numbers) {
		double sum = 0;
		int i = 0;
		while (i < numbers.length) {
			sum = sum + numbers[i];
			i++; // Or i = i + 1, or i += 1
		}
		return sum;
	}

	// Unlike the other three versions, this one fails for a 0-length array.
	public static double calcSum4(double[] numbers) {
		double sum = 0;
		int i = 0;
		do {
			sum = sum + numbers[i];
			i++;
		} while (i < numbers.length);
		return sum;
	}
}