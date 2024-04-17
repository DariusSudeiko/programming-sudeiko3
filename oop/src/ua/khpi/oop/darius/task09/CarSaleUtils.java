package ua.khpi.oop.darius.task09;

public class CarSaleUtils {
	public static void printCars(CarSale[] cars) {
		for (CarSale car : cars) {
			System.out.println(car);
		}
	}

	public static Double sumPrices(CarSale[] cars) {
		double sum = 0;
		for (CarSale car : cars) {
			sum += car.getCost();
		}
		return sum;
	}
}
