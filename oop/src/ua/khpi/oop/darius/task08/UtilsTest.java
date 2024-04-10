package ua.khpi.oop.darius.task08;

public class UtilsTest {
		public static void main(String[] args) {
			Shape[] shapes = { new Circle(10), new Rectangle(20, 30), new Square(40) };
			ShapeUtils.printShapes(shapes);
			Double sum = ShapeUtils.sumAreas(shapes);
			System.out.format("%.2f", sum);
		}
	}
