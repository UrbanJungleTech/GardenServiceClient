 package frentz.daniel.garden.model;

 import java.util.ArrayList;
 import java.util.List;

public class Garden {
    private Long id;

    private String name;
    private String description;
    private List<Plant> plants;
    private GardenHardwareController hardwareController;

    public Garden(){
        this.plants = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GardenHardwareController getHardwareController() {
        return hardwareController;
    }

    public void setHardwareController(GardenHardwareController hardwareController) {
        this.hardwareController = hardwareController;
    }

}
