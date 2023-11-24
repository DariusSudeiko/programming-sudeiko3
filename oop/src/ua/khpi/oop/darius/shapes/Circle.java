package ua.khpi.oop.darius.shapes;

import java.lang.Math;

public class Circle {
	private double radius;
	private double area;

	public Circle(double i) {
		this.radius = i;
	}

	public double getRadius() {
		;
		return radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public void setArea(double i) {
		area = i;
		radius = Math.sqrt(area / Math.PI);
	}
}
