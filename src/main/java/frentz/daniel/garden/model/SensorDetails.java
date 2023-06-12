package frentz.daniel.garden.model;

import java.util.ArrayList;
import java.util.List;

public class SensorDetails {

    private List<GardenSensor> temperature;
    private List<GardenSensor> moisture;

    public SensorDetails(){
        this.temperature = new ArrayList<GardenSensor>();
        this.moisture = new ArrayList<GardenSensor>();
    }
    public List<GardenSensor> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<GardenSensor> temperature) {
        this.temperature = temperature;
    }

    public List<GardenSensor> getMoisture() {
        return moisture;
    }

    public void setMoisture(List<GardenSensor> moisture) {
        this.moisture = moisture;
    }

    public void addMoisture(GardenSensor sensor){
        this.moisture.add(sensor);
    }

    public void addTemperature(GardenSensor sensor){
        this.temperature.add(sensor);
    }
}
