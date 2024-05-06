package ua.khpi.oop.darius.task11;

import java.util.List;
import java.util.ArrayList;

public class Util<T> {
	public static <T> T getLast(List<T> list) {
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(list.size() - 1);
	}

	public static void main(String[] args) {

		ArrayList<Circle> Circles = new ArrayList<Circle>();
		while (Circles.size() < 10) {
			Circles.add(new Circle(Math.random()));
		}
		Circle lastCircle = Util.getLast(Circles);
		System.out.println(Circles);
		System.out.println(lastCircle);

		List<String> wordList = new ArrayList<>();
		while (wordList.size() < 10) {
			wordList.add(new String("new string " + Math.random()));
		}
		String lastWord = Util.getLast(wordList);
		System.out.println(wordList);
		System.out.println(lastWord);
	}
}