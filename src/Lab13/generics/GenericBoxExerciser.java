package Lab13.generics;

public class GenericBoxExerciser {
    public static void main(String[] args) {
        GenericBox<Integer> t1 = new GenericBox<>();
        GenericBox<String> t2 = new GenericBox<>();

        t1.setT(10);
        t2.setT("Hello world");

        System.out.println(t1.getT());
        System.out.println(t2.getT());
    }
}
