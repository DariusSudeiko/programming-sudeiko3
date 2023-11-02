package ua.khpi.oop.darius.task05Extra;

class One {
	int x;

	One() {
		System.out.println("One::One()");
		this.x=999;
	}

	One(int x) {
		System.out.println("One::One(int)");
		x = this.x;
	}

	public One getInstance() {
		return this;
	}
}