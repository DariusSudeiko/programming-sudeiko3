package ua.khpi.oop.darius.task07;

/**
 * Represents a square, which is a special case of a rectangle with equal side
 * lengths.
 */
public class Square extends Rectangle {

    /**
     * Constructs a square with the specified side length.
     * 
     * @param sideLength The length of each side of the square.
     */
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    /**
     * Sets the side length of the square.
     * 
     * @param sideLength The new length of each side of the square.
     */
    public void setSideLength(double sideLength) {
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }

    /**
     * Sets the area of the square by calculating the side length.
     * 
     * @param area The new area of the square.
     */
    public void setArea(double area) {
        // Calculate the side length from the given area
        double sideLength = Math.sqrt(area);
        this.setSideLength(sideLength);
    }

    /**
     * Overrides the setWidth method to ensure consistent behavior with setSideLength.
     * 
     * @param width The new width of the square.
     */
    @Override
    public void setWidth(double width) {
        this.setSideLength(width);
    }

    /**
     * Overrides the setHeight method to ensure consistent behavior with setSideLength.
     * 
     * @param height The new height of the square.
     */
    @Override
    public void setHeight(double height) {
        this.setSideLength(height);
    }

    /**
     * Provides a string representation of the square, including its side length and
     * area.
     * 
     * @return A string representation of the square.
     */
    @Override
    public String toString() {
        return "Square: side length = " + this.getWidth() + ", area = " + this.getArea();
    }
}