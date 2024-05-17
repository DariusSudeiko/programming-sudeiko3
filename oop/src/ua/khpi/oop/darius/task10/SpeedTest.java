package ua.khpi.oop.darius.task10;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
	public static void main(String[] args) {
		// Define the sizes of the lists to be tested
		int[] listSizes = { 1000, 10000, 100000, 1000000 };

		// Perform tests for each list size
		for (int size : listSizes) {
			// Create and populate ArrayList
			List<Integer> arrayList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				arrayList.add(i);
			}

			// Create and populate LinkedList
			List<Integer> linkedList = new LinkedList<>();
			for (int i = 0; i < size; i++) {
				linkedList.add(i);
			}

			// Test ArrayList
			Instant startArrayList = Instant.now();
			for (int i = 0; i < size * 100; i++) {
				int middleElement = arrayList.get(size / 2);
			}
			Instant finishArrayList = Instant.now();
			long timeElapsedArrayList = Duration.between(startArrayList, finishArrayList).toMillis();
			System.out.println("ArrayList (size " + size + "): " + timeElapsedArrayList + " milliseconds");

			// Test LinkedList
			Instant startLinkedList = Instant.now();
			for (int i = 0; i < size * 100; i++) {
				int middleElement = linkedList.get(size / 2);
			}
			Instant finishLinkedList = Instant.now();
			long timeElapsedLinkedList = Duration.between(startLinkedList, finishLinkedList).toMillis();
			System.out.println("LinkedList (size " + size + "): " + timeElapsedLinkedList + " milliseconds");
		}
	}
}
