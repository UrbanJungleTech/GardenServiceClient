package frentz.daniel.garden.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorDetails {

    private Map<String, List<GardenSensor>> gardenSensors;

    public SensorDetails(){
        this.gardenSensors = new HashMap<>();
    }

    public List<GardenSensor> getSensors(String sensorType){
        return this.gardenSensors.get(sensorType);
    }

    public void addSensor(GardenSensor gardenSensor){
        String sensorType = gardenSensor.getSensorType();
        if(!this.gardenSensors.containsKey(sensorType)){
            this.gardenSensors.put(sensorType, new ArrayList<>());
        }
        this.gardenSensors.get(sensorType).add(gardenSensor);
    }

    public List<GardenSensor> getSensors(){
        List<GardenSensor> result = new ArrayList<>();
        for(List<GardenSensor> gardenSensors : this.gardenSensors.values()){
            result.addAll(gardenSensors);
        }
        return result;
    }

    public List<GardenSensor> getSensorsByType(String sensorType){
        return this.gardenSensors.get(sensorType);
    }
}
