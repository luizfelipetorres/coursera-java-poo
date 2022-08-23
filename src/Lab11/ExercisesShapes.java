package Lab11;

import Lab5.ex1.Box;
import Lab9.ex1.Cube;

public class ExercisesShapes {
    public static void main(String[] args) {
        Rectangle ret1 = new Rectangle(10, 20);
        Rectangle ret2 = new Rectangle(5, 3, "Oswaldo", "preto");

        Square s1 = new Square(10);
        Square s2 = new Square(15);

        Cube c1 = new Cube(30);
        Cube c2 = new Cube(20);

        Box b1 = new Box(3);
        Box b2 = new Box(10, 20, 30);

        Shape[] shapes = {ret1, ret2, s1, s2, c1, c2, b1, b2};


        Circle ci = new Circle(5);

        TwoDimensional[] t =  new TwoDimensional[]{ci, ret1, s1};

        for (TwoDimensional twoDimensional : t) {
            System.out.println(twoDimensional.getArea());
            System.out.println(twoDimensional.getPerimeter());
        }
 
    }
}
