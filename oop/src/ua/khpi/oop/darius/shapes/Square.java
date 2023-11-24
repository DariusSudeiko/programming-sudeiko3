package ua.khpi.oop.darius.shapes;

import java.lang.Math;

class Square {
	private double width;
	private double area;

	public void setArea(double i) {
		this.area = i;
		this.width = Math.sqrt(area);
	}

	public double getwidth() {
		return width;
	}

	public Square(double i) {
		this.width = i;
	}

	public double getArea() {
		return width * width;
	}

}
