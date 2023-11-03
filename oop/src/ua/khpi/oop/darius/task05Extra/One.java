package ua.khpi.oop.darius.task05Extra;

class One {
	int x;

	One() {
		this(999);
		System.out.println("One::One()");
	}

	One(int x) {
		System.out.println("One::One(int)");
		this.x = x;
	}

	public One getInstance() {
		return this;
	}
}