package ua.khpi.oop.darius.task10;

import java.util.HashMap;
import java.util.Map;

public class nums {
	static public void main(String[] args) {
		Map<Integer, String> numbers = new HashMap<Integer, String>();
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");

		int key = 2;
		String value = numbers.get(key);

		if (numbers.containsKey(key)) {
			System.out.println(value);
		} else
			System.out.println("key not found");
	}
}