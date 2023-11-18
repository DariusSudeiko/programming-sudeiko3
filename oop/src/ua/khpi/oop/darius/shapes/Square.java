package ua.khpi.oop.darius.shapes;

import java.lang.Math;

class Square {
	protected double width;
	protected double area;

	protected void setArea(double i) {
		this.area = i;
		this.width = Math.sqrt(area);
	}

	Square(double i) {
		this.width = i;
	}

	protected double getArea() {
		return width * width;
	}

}
