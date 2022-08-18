package Lab6.ex1;

import Lab5.ex1.Box;

public class BoxDriver {
    public static void main(String[] args) {
        var box1 = new Box(7, 6, 5);
        var box2 = new Box(10);

        box1.printBox();
        box2.printBox();

        box1.setLength(3);
        box1.setWidth(4);
        box1.setHeight(5);
        System.out.println("");
        box1.printBox();

        
        System.out.println("");
        box1.setLength(-5);
        box1.printBox();

        System.out.println("");
        var box3 = new Box(10, 10, -10);
        box3.printBox();
    }
}
