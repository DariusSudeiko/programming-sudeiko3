package ua.khpi.oop.darius.task10;

import java.util.ArrayList;

public class lab10 {
	public static void main(String[] args) {
		ArrayList<Circle> Circles = new ArrayList<Circle>();
		while (Circles.size() < 10) {
			Circles.add(new Circle(Math.random()));
		}
		for (Circle x : Circles) {
			System.out.println(x.toString());
		}
	}

}
