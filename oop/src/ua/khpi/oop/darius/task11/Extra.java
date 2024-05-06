package ua.khpi.oop.darius.task11;

public class Extra {
	public static void main(String[] args) {
		Pair<String> twoNames = new Pair<>("Juan", "Juanita");
		System.out.printf("twoNames=%s.%n", twoNames);
		String nameA = twoNames.getA(); // Value is "Juan"
		String nameB = twoNames.getB(); // Value is "Juanita"
		System.out.printf(" First item: %s.%n", nameA);
		System.out.printf(" Second item: %s.%n", nameB);

		Pair<Integer> twoNums = new Pair<>(11, 22);
		System.out.printf("twoNums=%s.%n", twoNums);
		Integer numA = twoNums.getA(); // Value is 11
		Integer numB = twoNums.getB(); // Value is 22
		System.out.printf(" First item: %s.%n", numA);
		System.out.printf(" Second item: %s.%n", numB);
	}

}
