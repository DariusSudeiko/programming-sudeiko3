package ua.khpi.oop.darius.task12;

class PrintMessageTask implements Runnable {
	private String text;
	private long delay;
	private int number;
	private static long stopTime;

	public PrintMessageTask(String text, long delay, int number) {
		this.text = text;
		this.delay = delay;
		this.number = number;
	}

	public static void setStopTime(long stopTime) {
		PrintMessageTask.stopTime = stopTime;
	}

	public void run() {
		try {
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < number; i++) {
				if (System.currentTimeMillis() - startTime >= stopTime) {
					System.out.println("Time limit exceeded. Stopping...");
					break;
				}
				System.out.println(text); // Print the message
				Thread.sleep(delay); // Delay between messages
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
