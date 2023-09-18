package ua.khpi.oop.Darius.task03;

//task 4,5,6

public class Argument {
	public static void main(String[] args) {
		// Get the number of command-line arguments
		System.out.println("You supplied " + args.length + " arguments.");
		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println(args[i].toUpperCase());
		}
		// Menu: Run / Run Configurations / Arguments -> Program arguments
		coinflip(args.length);

	}

	public static void coinflip(int K) {

		for (int i = 0; i < K; ++i) {
			if (java.lang.Math.random() < 0.5) {
				System.out.println("heads");
			} else
				System.out.println("tails");
		}

	}
}
