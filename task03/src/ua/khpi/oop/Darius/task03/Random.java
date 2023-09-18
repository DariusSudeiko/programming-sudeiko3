package ua.khpi.oop.Darius.task03;
// task 01
public class Random {
	public static void main(String[] args) {
		rand(3);
	}

	public static void rand(int K) {

		for (int i = 0; i < K; ++i) {
			if (java.lang.Math.random() < 0.5) {
				System.out.println("heads");
			} else
				System.out.println("tails");
		}
	}

}
