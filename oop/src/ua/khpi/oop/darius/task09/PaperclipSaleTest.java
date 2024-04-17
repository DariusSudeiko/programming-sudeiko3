package ua.khpi.oop.darius.task09;

public class PaperclipSaleTest {

	public static void main(String[] args) {
		PaperclipSale[] clips = { new PaperclipSale("Red", 10, 100), new PaperclipSale("Blue", 8, 50),
				new PaperclipSale("Green", 12, 150) };
		PaperclipSaleUtils.printClips(clips);
		Double sum = PaperclipSaleUtils.sumPrices(clips);
		System.out.print("Total earnings: " + sum);
		
	};
}
