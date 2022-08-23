package Lab12;

import Lab11.Circle;
import Lab11.Rectangle;
import Lab11.Shape;
import Lab11.Square;
import Lab5.ex1.Box;
import Lab9.ex1.Cube;

public class ExercisePrint {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
            new Rectangle(10, 20),
            new Square(10),
            new Cube(5),
            new Box(10, 2, 3),
            new Circle(6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
