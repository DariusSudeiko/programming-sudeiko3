package ua.khpi.oop.darius.task07;

/**
 * Represents a rectangle with a specified width and height.
 */
public class Rectangle {
    private double width, height;

    /**
     * Constructs a rectangle with the specified width and height.
     * 
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Provides a string representation of the rectangle, including its width, height, and area.
     * 
     * @return A string representation of the rectangle.
     */
    public String toString() {
        return "width = " + this.width + " height = " + this.height + " area = " + this.getArea();
    }

    /**
     * Returns the width of the rectangle.
     * 
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of the rectangle.
     * 
     * @return The height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates and returns the area of the rectangle.
     * 
     * @return The area of the rectangle.
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Sets the width of the rectangle to the specified value.
     * 
     * @param width The new width of the rectangle.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the height of the rectangle to the specified value.
     * 
     * @param height The new height of the rectangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }
}