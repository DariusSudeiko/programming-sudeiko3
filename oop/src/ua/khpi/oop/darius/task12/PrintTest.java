package ua.khpi.oop.darius.task12;

public class PrintTest {
	public static void main(String[] args) {
		PrintMessageTask task = new PrintMessageTask("abc", 1000, 5);
		long startTime = System.currentTimeMillis();
		task.run();
		long elapsedMillis = System.currentTimeMillis() - startTime;
		System.out.println("Time: " + elapsedMillis);
	}

}
