package Lab7;

import java.util.ArrayList;

import Lab5.ex2.calculators.BasicCalculator;
import Lab5.ex2.calculators.ScientificCalculator;
import Lab5.ex2.calculators.TrigonometricCalculator;

public class CalculatorDriver {
    public static void main(String[] args) {
        var basic = new BasicCalculator();
        var sci = new ScientificCalculator();
        var tri = new TrigonometricCalculator();

        ArrayList<Double> arr = new ArrayList<>(){{
            add(basic.add(1, 4));
            add(basic.subtract(3, 5));
            add(basic.multiply(5, 5));
            add(basic.divide(15, 3));
            add(sci.exp(10));
            add(sci.log(10)); 
        }};

        for (Double n : arr) {
            System.out.println(n);
        }

        arr.forEach(e -> System.out.println(e));
    }
}
