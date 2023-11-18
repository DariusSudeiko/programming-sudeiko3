package ua.khpi.oop.darius.shapes;

class Rectangle {
	protected double width, height;

	protected double getArea() {
		return width * height;
	}

	Rectangle(double i, double j) {
		this.width = i;
		this.height = j;
	}

}
