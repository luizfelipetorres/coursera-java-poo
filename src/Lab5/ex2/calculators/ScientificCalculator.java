package Lab5.ex2.calculators;

public class ScientificCalculator {
    public final static double PI = 3.14159;
    private double holdValue;

    public final double exp(double x){
        return Math.pow(Math.E, x);
    }

    public final double log(double x){
        return Math.log(x);
    }

    public final void putValueInMemory(double x){
        holdValue = x;
    }
    
    public final double getValueFromMemmory(){
        return holdValue;
    }
}
