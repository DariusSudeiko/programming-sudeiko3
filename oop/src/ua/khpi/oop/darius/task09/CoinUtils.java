package ua.khpi.oop.darius.task09;
public class CoinUtils {
	public static Coin flip() {
		return Math.random() < 0.5 ? Coin.HEADS : Coin.TAILS;
	}
}
