package frentz.daniel.model;


public class Heater extends GardenHardware{
    private long power;

    public Heater(){
        this.hardwareCategory = "HEATER";
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }
}
