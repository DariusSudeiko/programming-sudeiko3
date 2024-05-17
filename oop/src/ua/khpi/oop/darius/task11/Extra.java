package ua.khpi.oop.darius.task11;

public class Extra {
	public static void main(String[] args) {
		String A = "Juan";
		String B = "Juanita";
		double ABalance = 2345678.99;
		double BBalance = 15455.26;

		System.out.printf("%8s", A);
		System.out.print("'s bank account balance is $");
		System.out.printf("%10.2f \n", ABalance);
		System.out.printf("%8s", B);
		System.out.print("'s bank account balance is $");
		System.out.printf("%10.2f ", BBalance);
	}

	// DecimalFormat formatter = new DecimalFormat("#,##0.00");
	// String formattedBalance = formatter.format(balance);
}