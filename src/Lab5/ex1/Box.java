package Lab5.ex1;

public class Box {
    private double height;
    private double width;
    private double length;
    
    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(double cubeValue){
        this(cubeValue, cubeValue, cubeValue);
    }
    
    public void printBox() {
        if(height <= 0 || width <= 0 || length <= 0){
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
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
}
