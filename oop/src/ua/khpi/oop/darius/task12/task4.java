package ua.khpi.oop.darius.task12;

public class task4 {
	public static void main(String[] args) {
		PrintMessageTask task = new PrintMessageTask("abc", 1000, 5);
		PrintMessageTask task1 = new PrintMessageTask("def", 1000, 5);

		// Create new threads for each task
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task1);

		// Start the threads
		thread1.start();
		thread2.start();

		// Wait for threads to finish
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Both tasks completed.");
	}
}