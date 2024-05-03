package ua.khpi.oop.darius.task10;

import java.util.ArrayList;
import java.util.List;

public class compareTest {
	public static void main(String[] args) {
		List<Circle> arrayList = new ArrayList<Circle>();
		arrayList.add(new Circle(3));
		arrayList.add(new Circle(2));
		arrayList.add(new Circle(1));
		System.out.println(arrayList);
		MyComparator myComparator = new MyComparator();
		arrayList.sort(myComparator);
		System.out.println(arrayList);
	}

}
