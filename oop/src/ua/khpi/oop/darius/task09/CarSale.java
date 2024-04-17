package ua.khpi.oop.darius.task09;

public class CarSale {
	public CarSale(String carName, double listPrice, double discount) {
		this.carName = carName;
		this.listPrice = listPrice;
		this.discount = discount;
	}

	private final String carName;
	private final double listPrice;
	private final double discount;

	public double getCost() {
		return listPrice * (1.0 - discount / 100);
	}

	public String toString() {
		return carName + " " + getCost();
	}
}