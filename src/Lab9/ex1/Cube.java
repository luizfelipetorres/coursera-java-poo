package Lab9.ex1;

import Lab5.ex1.Box;

public class Cube extends Box {
    public Cube(double cubeValue) {
        super(cubeValue);
    }

    @Override
    public void setHeight(double height) {
        if (height != super.getHeight()) {
            setSide(height);
        }
    }

    @Override
    public void setLength(double length) {
        if (length != super.getLength()) {
            setSide(length);
        }
    }

    @Override
    public void setWidth(double width) {
        if (width != super.getWidth()) {
            setSide(width);
        }
    }

    public void setSide(double side) {
        if (side > 0) {
            super.setLength(side);
            super.setHeight(side);
            super.setWidth(side);
        } else {
            System.out.println("Invalid value!");
        }
    }

    public double getSide() {
        return getLength();
    }

    @Override
    public String toString() {
        return String.format("height: %f\nlength: %f\nwidth: %f\n", getHeight(), getLength(), getWidth());
    }
}
