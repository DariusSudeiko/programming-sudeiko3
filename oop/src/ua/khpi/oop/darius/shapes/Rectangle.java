package ua.khpi.oop.darius.shapes;

public class Rectangle {
	double width, height;

	double getArea() {
		return width * height;
	}

	Rectangle(double i, double j) {
		this.width = i;
		this.height = j;
	}

}
