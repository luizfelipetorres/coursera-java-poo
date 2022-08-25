package Lab15;

public class CoffeeExerciser {
    public static void main(String[] args) {
        Coffee cafe = null;

        try {
            cafe = new Coffee(125);
        } catch (Exception e) {
            e.getStackTrace();
        }finally{
            System.out.println("Temperatura do café: " + cafe.getTemperature());
        }
    }
}
