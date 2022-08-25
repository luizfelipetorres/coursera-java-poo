package Lab17;

public class PrintEnums {
    public static void main(String[] args) {

        System.out.println("Inicio");
        for (TirePressures tPressures : TirePressures.values()) {
            System.out.printf("%s está com %d de pressão\n", tPressures.getName(), tPressures.getPressure());
        }

        TirePressures.valueOf("RB").overridePressure(10);
        System.out.println("\nDepois");
        for (TirePressures tirePressures : TirePressures.values()) {
            System.out.printf("%s está com %d de pressão\n", tirePressures.getName(), tirePressures.getPressure());
        }
    }
}
