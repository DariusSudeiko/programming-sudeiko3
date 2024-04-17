package ua.khpi.oop.darius.task09;

public class CarSaleTest {

public static void main(String[] args) {
    CarSale[] cars = { new CarSale("BMW", 100000, 10), new CarSale("Audi", 80000, 5), new CarSale("Mercedes", 120000, 15) };
    CarSaleUtils.printCars(cars);
    Double sum = CarSaleUtils.sumPrices(cars);
    System.out.print(sum);
};

}