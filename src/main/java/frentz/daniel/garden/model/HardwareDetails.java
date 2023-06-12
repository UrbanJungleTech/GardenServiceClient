package frentz.daniel.garden.model;

import java.util.ArrayList;
import java.util.List;

public class HardwareDetails {
    private List<Light> lights;

    public List<Light> getLights() {
        return lights;
    }

    public void setLights(List<Light> lights) {
        this.lights = lights;
    }

    public List<Water> getWaters() {
        return waters;
    }

    public void setWaters(List<Water> waters) {
        this.waters = waters;
    }

    public List<Heater> getHeaters() {
        return heaters;
    }

    public void setHeaters(List<Heater> heaters) {
        this.heaters = heaters;
    }

    private List<Water> waters;
    private List<Heater> heaters;


    public HardwareDetails(){
        this.lights = new ArrayList<>();
        this.waters = new ArrayList<>();
        this.heaters = new ArrayList<>();
    }

    public void addLight(Light light){
        this.lights.add(light);
    }

    public void addWater(Water water){
        this.waters.add(water);
    }

    public void addHeater(Heater heater){
        this.heaters.add(heater);
    }
}
