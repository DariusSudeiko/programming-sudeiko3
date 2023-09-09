package ua.khpi.oop.Darius.task02;

public class LoopEx {
	public static void main(String[] args) {
		printNums1(3);
		printNums2(3);
		printNums3(3);
	}
	public static void printNums1(int upperLimit) {
		// TODO: Print out the numbers from 0 up to and including upperLimit.
		for(int i=0;i<=upperLimit;++i) {
			System.out.println(i);
		}
	}
	public static void printNums2(int upperLimit) {
		// TODO: Print out every second number from 0 up to and including upperLimit.
		for(int i=0;i<=upperLimit;i+=2) {
			System.out.println(i);
		}
	}
	public static void printNums3(int upperLimit) {
		// TODO: Print out every second number from 0 up to and including upperLimit.
		int reverse=upperLimit;
		for(int i=0;i<=upperLimit;++i) {
			System.out.println(reverse);
			--reverse;
			
		}
	}
}
