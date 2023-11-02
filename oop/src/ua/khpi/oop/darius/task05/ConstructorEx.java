package ua.khpi.oop.darius.task05;

import java.util.Arrays;

public class ConstructorEx {
	int[] array;

	ConstructorEx(int length) {
		// TODO: Initialize the field "array" by creating a new array using the
		// specified "length".
		array = new int[length];
	}

	ConstructorEx(int[] srcArray) {
		// TODO: Initialize the "array" field with the reference
		// to the specified "srcArray".
		array = srcArray;
	}

	ConstructorEx(int[] srcArray, boolean copyArray) {
		// TODO: Initialize the "array" field by reference to the specified "srcArray"
		// or by copying the contents of the "srcArray" depending on the "copyArray"
		// flag.
		if (copyArray) {
			array = Arrays.copyOf(srcArray, srcArray.length);
		}
		else
			array = srcArray;
	}
}
