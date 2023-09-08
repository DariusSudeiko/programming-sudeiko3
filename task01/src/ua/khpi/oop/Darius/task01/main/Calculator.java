package ua.khpi.oop.Darius.task01.main;

public class Calculator {

	public int inc(int a) {
		// TODO Add one to 'a'

		// TODO return your calculated value
		// instead of 0
		return a + 1;
	}

	public int dec(int a) {
		// TODO Subtract one from 'a'

		// TODO return your calculated value
		// instead of 0
		return a - 1;
	}

	public int sum(int a, int b) {
		// TODO Calculate the sum of 'a' and 'b'

		// TODO return your calculated value
		// instead of 0
		return a + b;
	}

	public String check(int a) {
		if (a > 0) {
			return "positive";
		} else if (a < 0) {
			return "negative";
		} else {
			return "zero";
		}
		// TODO Check that 'a' is positive or negative.
		// If 'a' is positive return "positive".
		// If 'a' is negative return "negative".
		// If a is zero return "zero".
	}

}