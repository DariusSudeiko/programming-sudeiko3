package ua.khpi.oop.darius.task05Extra;

public class Main {

	public static void main(String[] args) {

		One a = new One();
		System.out.println(a.x);

		One b = a.getInstance();
		System.out.println(a == b);
	}

}