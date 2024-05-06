package ua.khpi.oop.darius.task11;

import java.util.ArrayList;
import java.util.List;

public class Util2 {
	public static <T> T getLast(List<T> list) {
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(list.size() - 1);
	}

	public static <T> T getLast(T[] array) {
		if (array == null || array.length == 0) {
			return null;
		}
		return array[array.length - 1];
	}

	public static void main(String[] args) {

		List<String> wordList = new ArrayList<>();
		while (wordList.size() < 10) {
			wordList.add(new String("new string " + Math.random()));
		}
		String[] wordArray = new String[10];
		for (int i = 0; i < wordArray.length; i++) {
			wordArray[i] = "new string " + Math.random();
		}

		String lastWord1 = Util2.getLast(wordList);
		System.out.println(wordList);
		System.out.println(lastWord1);
		String lastWord2 = Util2.getLast(wordArray);
		for (String x : wordArray) {
			System.out.println(x);
		}
		System.out.println(lastWord2);
	}
}
