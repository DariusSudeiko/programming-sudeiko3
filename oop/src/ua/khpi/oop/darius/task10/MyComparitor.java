package ua.khpi.oop.darius.task10;

import java.util.Comparator;

class MyComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }
}