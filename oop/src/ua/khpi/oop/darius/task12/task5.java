package ua.khpi.oop.darius.task12;

import java.util.ArrayList;
import java.util.Random;

public class task5 {
	;
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<PrintMessageTask> Prints = new ArrayList<>();
		for (int i = 0; i <= 20; i++) {
			Prints.add(new PrintMessageTask("abc " + i, rand.nextInt(10000), rand.nextInt(10)));
		}
		// Set the stop time for all instances of PrintMessageTask
		PrintMessageTask.setStopTime(1000);

		// Create new threads for each task
		ArrayList<Thread> threads = new ArrayList<>();
		for (PrintMessageTask task : Prints) {
			Thread thread = new Thread(task);
			threads.add(thread);
		}

		// Start each thread
		for (Thread thread : threads) {
			thread.start();
		}
	}
}
