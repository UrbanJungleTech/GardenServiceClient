package frentz.daniel.garden.model;

public class Water extends GardenHardware{
    private long pressure;

    public Water(){
        this.hardwareCategory = "WATER";
    }

    public long getPressure() {
        return pressure;
    }

    public void setPressure(long pressure) {
        this.pressure = pressure;
    }
}
