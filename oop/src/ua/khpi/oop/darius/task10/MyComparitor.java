package ua.khpi.oop.darius.task10;


import java.util.Comparator;


class MyComparator implements Comparator<Circle> {
	public int compare(Circle o1, Circle o2) {
		// TODO: Implement comparison algorithm here.
		if (o1.getArea() > o2.getArea()) {
			return 1;
		} else
			return -1;
	}
}