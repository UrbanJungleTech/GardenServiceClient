package frentz.daniel.garden.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HardwareDetails {

    private Map<String, List<GardenHardware>> hardware;

    public HardwareDetails(){
        this.hardware = new HashMap<>();
    }

    public List<GardenHardware> getHardware(String hardwareType){
        return this.hardware.get(hardwareType);
    }

    public List<GardenHardware> getHardware(){
        List<GardenHardware> result = new ArrayList<>();
        for(List<GardenHardware> hardware : this.hardware.values()){
            result.addAll(hardware);
        }
        return result;
    }

    public void addHardware(GardenHardware gardenHardware){
        String hardwareType = gardenHardware.getHardwareCategory();
        if(!this.hardware.containsKey(hardwareType)){
            this.hardware.put(hardwareType, new ArrayList<>());
        }
        this.hardware.get(hardwareType).add(gardenHardware);
    }

}
