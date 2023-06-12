package frentz.daniel.garden.model;

public class Light extends GardenHardware{
    private long power;
    private String colour;

    public Light(){
        this.hardwareCategory = "LIGHT";
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
