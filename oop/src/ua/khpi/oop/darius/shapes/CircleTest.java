package ua.khpi.oop.darius.shapes;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] circles = new Circle[100];
		double sum = 0;
		for (int i = 0; i < circles.length; ++i) {
			circles[i] = new Circle(10 * Math.random());
			sum = sum + circles[i].getArea();
		}
		double[] radiusList = new double[100];
		for (int i = 0; i < circles.length; ++i) {
			radiusList[i] = circles[i].radius;
		}
		bubbleSort.sort(radiusList, 100);

		System.out.print("biggest in the list = " + radiusList[radiusList.length - 1]);
		System.out.print("\nsmallest in the list = " + radiusList[0]);
		System.out.print("\nsum of areas = " + sum + "\n\n");

		for (int i = 0; i < 10; i++) {
			double radius = 10 * Math.random();
			Circle c = new Circle(radius);
			System.out.println("Circle " + (i + 1));
			System.out.println("Generated radius: " + radius);
			System.out.println("Stored radius:    " + c.radius);
			System.out.println();

		}
	}
}
