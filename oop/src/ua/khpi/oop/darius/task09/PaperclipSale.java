package ua.khpi.oop.darius.task09;

public class PaperclipSale {
	public PaperclipSale(String clipColour, double perBoxPrice, double saleCount) {
		this.clipColour = clipColour;
		this.perBoxPrice = perBoxPrice;
		this.saleCount = saleCount;
	}

	private final String clipColour;
	private final double perBoxPrice;
	private final double saleCount;
	
	public double getEarnings() {
		return perBoxPrice * saleCount;
	}


	public String toString() {
		return clipColour + " " + getEarnings();
	}
}