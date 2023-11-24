package ua.khpi.oop.darius.shapes;

public class Rectangle {
	private double width, height;

	public double getArea() {
		return width * height;
	}

	public double getwidth() {
		return width;
	}

	public double getheight() {
		return width;
	}

	public Rectangle(double i, double j) {
		this.width = i;
		this.height = j;
	}

}
