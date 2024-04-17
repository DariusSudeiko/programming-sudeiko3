package ua.khpi.oop.darius.task09;

public class Main {
	public static void main(String[] args) {
		PaperclipSale[] clips = { new PaperclipSale("Red", 10, 100), new PaperclipSale("Blue", 8, 50),
				new PaperclipSale("Green", 12, 150) };
		PaperclipSaleUtils.printClips(clips);
		Double sum = PaperclipSaleUtils.sumPrices(clips);
		System.out.print("Total earnings: " + sum + "\n");

		CarSale[] cars = { new CarSale("BMW", 50000,10), new CarSale("Audi", 40000,5), new CarSale("Mercedes", 60000,15) };
		CarSaleUtils.printCars(cars);
		sum = CarSaleUtils.sumPrices(cars);
		System.out.print("Total earnings: " + sum + "\n");

		BothUtils.cheapest(clips, cars);
		BothUtils.totalCost(clips, cars);
		BothUtils.SortAndPrint(clips, cars);
	};

}
