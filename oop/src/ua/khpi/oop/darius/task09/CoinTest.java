package ua.khpi.oop.darius.task09;

public class CoinTest {
	public static void main(String[] args) {
		int headsCount = 0;
		int tailsCount = 0;
		for (int i = 0; i < 1000; i++) {
			Coin coin = CoinUtils.flip();
			if (coin == Coin.HEADS) {
				headsCount++;
			} else {
				tailsCount++;
			}
		}
		System.out.println("Heads: " + headsCount);
		System.out.println("Tails: " + tailsCount);
	}

}
