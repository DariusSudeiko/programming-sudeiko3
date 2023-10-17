package ua.khpi.oop.darius.task04;

public class Two {
	// square
	public double area(double side) {
		return side * side;
	}

	// rectangle
	public double area(double length, double width) {
		return length * width;
	}

	// triangle
	public double area(double base, double height, char c) {
		return 0.5 * base * height;
	}

	public static void main(String[] args) {
		Two two = new Two();

		System.out.println("Square: " + two.area(5.0));
		System.out.println("Rectangle: " + two.area(5.0, 10.0));
		// Using char possible to create many more variations cube , prism etc..
		System.out.println("Triangle: " + two.area(5.0, 10.0, 't'));
	}

}
