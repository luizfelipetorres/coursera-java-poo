package Lab15;

public class Coffee {
    private int temperature;
    

    public Coffee(int temperature) throws TooHotException{
        try {
            this.setTemperature(temperature);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Setting temperature to 0.");
            setTemperature(0);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) throws TooHotException{
        if (temperature > 120) {
            throw new TooHotException("The coffee is too hot!");
        }
        this.temperature = temperature;
    }

    
}
