package ua.khpi.oop.Darius.task03;

// task 7

public class Match {
	public static void main(String[] args) {
		String[] testStrings = { "Hello", "Hi", "Hola", "Howdy" };
		if (isStringInArray(testStrings, "Hola")) {
			// TODO
			System.out.println("Hola is found");
		}
		if (isStringInArray(testStrings, "Hey")) {
			// TODO
			System.out.println("Hey");
		}
	}

	public static boolean isStringInArray(String[] strings, String potentialMatch) {
		// TODO
		for (int i = 0; i < strings.length; ++i) {
			if (strings[i] == potentialMatch)
				return true;
		}
		return false;
	}
}