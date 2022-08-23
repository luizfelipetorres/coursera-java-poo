package Lab11;

public class Rectangle extends Shape implements TwoDimensional {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this(length, width, "Unknown", "White");
    }

    public Rectangle(double length, double width, String name, String color) {
        super.setColor(color);
        super.setName(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return getArea() * 2;
    }

}
