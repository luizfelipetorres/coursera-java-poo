package Lab9.ex1;

import Lab5.ex1.Box;

public class Cube extends Box {
    public Cube(double cubeValue) {
        super(cubeValue);
    }

    @Override
    public void setHeight(double height) {
        setLength(height);
    }

    @Override
    public void setLength(double length) {
        if (length != super.getLength()) {
            super.setLength(length);
            super.setHeight(length);
            super.setWidth(length);
        }
    }

    @Override
    public void setWidth(double width) {
        setLength(width);
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
        super.setHeight(side);
    }

    public double getSide(){
        return getLength();
    }

    @Override
    public String toString() {
        return String.format("height: %f\nlength: %f\nwidth: %f\n", getHeight(), getLength(), getWidth());
    }
}
