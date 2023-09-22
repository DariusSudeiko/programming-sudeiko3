package ua.khpi.oop.darius.task03;
// task 01
public class Random {
	public static void main(String[] args) {
		coinFlip(3);
	}

	public static void coinFlip(int K) {

		for (int i = 0; i < K; ++i) {
			if (java.lang.Math.random() < 0.5) {
				System.out.println("heads");
			} else
				System.out.println("tails");
		}
	}

}
