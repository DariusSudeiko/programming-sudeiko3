package ua.khpi.oop.darius.task09;

public class PaperclipSaleUtils {
	public static void printClips(PaperclipSale[] clips) {
		for (PaperclipSale clip : clips) {
			System.out.println(clip);
		}
	}

	public static Double sumPrices(PaperclipSale[] clips) {
		double sum = 0;
		for (PaperclipSale clip : clips) {
			sum += clip.getEarnings() ;
		}
		return sum;
		
	}
}
