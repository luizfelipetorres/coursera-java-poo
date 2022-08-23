package Lab5.ex1;

import Lab11.Shape;
import Lab11.ThreeDimensional;

public class Box extends Shape implements ThreeDimensional{
    private double height;
    private double width;
    private double length;

    public Box(double height, double width, double length) {
        super();
        setColor("white");
        setName("Unknown");
        setHeight(height <= 0 ? 1 : height);
        setWidth(width <= 0 ? 1 : width);
        setLength(length <= 0 ? 1 : length);
    }

 

    @Override
    public String toString() {
        return "Box [height=" + height + ", length=" + length + ", width=" + width + ", getColor()=" + getColor() + ", getName()=" + getName() +  "]";
    }



    public Box(double cubeValue) {
        this(cubeValue, cubeValue, cubeValue);
    }

    public void printBox() {
        if (height <= 0 || width <= 0 || length <= 0) {
            System.out.println("This box contains invalid properties!");
            return;
        }
        System.out.println("Height = " + height);
        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("Volume = " + this.getVolume());
        System.out.println("Surface Area = " + this.getSurfaceArea());
    }

    public double getSurfaceArea() {
        return 2 * ((height * width) + (height * length) + (width * length));
    }

    public double getVolume() {
        return height * width * length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0)
            System.out.println("Height must be greater than zero!");
        else
            this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0)
            System.out.println("width must be greater than zero!");
        else
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0)
            System.out.println("length must be greater than zero!");
        else
            this.length = length;
    }
}
