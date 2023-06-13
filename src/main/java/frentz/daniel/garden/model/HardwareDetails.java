package frentz.daniel.garden.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HardwareDetails extends HashMap<String, List<GardenHardware>>{

    public List<GardenHardware> getHardware(String hardwareType){
        return get(hardwareType);
    }

    public List<GardenHardware> getHardware(){
        List<GardenHardware> result = new ArrayList<>();
        for(List<GardenHardware> hardware : values()){
            result.addAll(hardware);
        }
        return result;
    }

    public void addHardware(GardenHardware gardenHardware){
        String hardwareType = gardenHardware.getHardwareCategory();
        if(!containsKey(hardwareType)){
            put(hardwareType, new ArrayList<>());
        }
        get(hardwareType).add(gardenHardware);
    }

}
