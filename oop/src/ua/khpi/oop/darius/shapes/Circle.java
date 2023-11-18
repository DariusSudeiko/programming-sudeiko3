package ua.khpi.oop.darius.shapes;

import java.lang.Math;

class Circle {
	double radius;
	double area;

	Circle(double i) {
		this.radius = i;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	void setArea(double i) {
		area = i;
		radius = Math.sqrt(area / Math.PI);
	}
}
