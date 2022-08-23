package Lab13.generics;

import static java.lang.System.out;

public class GenericMethod {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            out.printf("%s\n", element);
        }
        out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Double[] arr2 = {1.0, 2.0, 3.0, 4.03};
        Character[] arr3 = {'a', 'b', 'c', 'd'};

        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

}
