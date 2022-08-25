package Lab17;

public enum TirePressures {
    LF(30, "Left front"),
    RF(31, "Right Front"),
    LB(32, "Left Back"),
    RB(33, "Right Back");

    private int pressure;
    private String name;

    private TirePressures(int pressure, String name) {
        setPressure(pressure);
        setName(name);
    }

    public void overridePressure(int pressure) {
        setPressure(pressure);
    }

    private void setName(String name) {
        this.name = name;
    }   

    public int getPressure() {
        return pressure;
    }

    public String getName() {
        return name;
    }

    private void setPressure(int pressure) {
        this.pressure = pressure;
    }

}
