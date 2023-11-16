package ua.khpi.oop.darius.shapes;

import java.lang.Math;

public class Square {
	double width;
	double area;

	void setArea(double i) {
		area = i;
		width = Math.sqrt(area);
	}

	Square(double i) {
		this.width = i;
	}

	double getArea() {
		return width * width;
	}

}
