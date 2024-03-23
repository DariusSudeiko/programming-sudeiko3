package ua.khpi.oop.darius.task08;

public class ShapeUtils {
	
	public static void printShapes(Object[] shapes) {
		for (Object s : shapes) {
			System.out.println(s);
		}
	}
	public static double sumAreas(Object[] shapes) {
		double sum = 0;
		for (Object s : shapes) {
			if (s instanceof Circle) {
				Circle c = (Circle) s;
				sum += c.getArea();
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s;
				sum += r.getArea();
			} else if (s instanceof Square) {
				Square sq = (Square) s;
				sum += sq.getArea();
			}
		}
		return (sum);
	}
}

