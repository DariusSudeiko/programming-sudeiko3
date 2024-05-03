package ua.khpi.oop.darius.task10;

public class Circle {

	private double radius;

	public Circle(double i) {
		this.radius = i;
	}

	public String toString() {
		return "Circle: radius = " + this.radius;//+ " area = " + this.getArea();
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}
