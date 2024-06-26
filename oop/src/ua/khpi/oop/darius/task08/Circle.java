package ua.khpi.oop.darius.task08;

/**
 * Represents a Circle with a given radius.
 */
public class Circle  extends Shape{
	/**
     * radius and area
     * 
     * @param radius
     * @param area
     */
	private double radius;
	/**
     * Constructs a Circle object with the given radius.
     * 
     * @param i the radius of the circle
     */
	public Circle(double i) {
		this.radius = i;
	}
	/**
     * Returns the string
     * 
     * @return the string
     */
	public String toString() {
        return "Circle: radius = " + this.radius + " area = " + this.getArea();
    }
	 /**
     * Returns the radius of the circle.
     * 
     * @return the radius of the circle
     */
	public double getRadius() {
		;
		return radius;
	}
	 /**
     * Returns the area of the circle.
     * 
     * @return the area of the circle
     */
	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}
	/**
     * Sets area for a given circle
     * 
     * @param i area of the circle
     */
}
