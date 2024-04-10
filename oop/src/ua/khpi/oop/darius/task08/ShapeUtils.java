package ua.khpi.oop.darius.task08;

public class ShapeUtils {
	public static void printShapes(Object[] shapes) {
		for (Object s : shapes) {
			System.out.println(s);
		}
	}

	public static double sumAreas(Shape[] shapes) {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.getArea();
        }
        return sum;
    }
	
}
