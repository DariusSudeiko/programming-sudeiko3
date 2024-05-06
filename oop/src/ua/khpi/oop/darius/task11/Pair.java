package ua.khpi.oop.darius.task11;

public class Pair<T> {
	private T A;
	private T B;

	public Pair(T first, T second) {
		this.A = first;
		this.B = second;
	}

	@Override
	public String toString() {
		return "Pair [A=" + A + ", B=" + B + "]";
	}

	public T getA() {
		return A;
	}

	public void setFirstName(T firstName) {
		this.A = firstName;
	}

	public T getB() {
		return (T) B;
	}

	public void setSecondName(T secondName) {
		this.B = secondName;
	}

}
