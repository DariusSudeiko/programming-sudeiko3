package ua.khpi.oop.darius.task10;

import java.util.HashMap;
import java.util.Map;

public class Employees {
	static public void main(String[] args) {
		Map<String, String> Employees = new HashMap<String, String>();
		Employees.put("a1234", "Steve Jobs");
		Employees.put("a1235", "Scott McNealy");
		Employees.put("a1236", "Jeff Bezos");
		Employees.put("a1237", "Larry Ellison");
		Employees.put("a1238", "Bill Gates");

		String key = "a1234";
		String value = Employees.get(key);
		// transform before lookup
		key.toLowerCase();
		if (Employees.containsKey(key)) {
			System.out.println(value);
		} else
			System.out.println("key not found");
	}
}
