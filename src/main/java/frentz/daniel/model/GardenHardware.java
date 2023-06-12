package frentz.daniel.model;

import frentz.daniel.hardwareservice.client.model.HardwareState;
import frentz.daniel.hardwareservice.client.model.Timer;

import java.util.List;


public class GardenHardware{
    protected Long id;
    protected Long port;
    protected String name;
    protected HardwareState desiredState;
    protected HardwareState currentState;

    protected String hardwareCategory;

    public String getHardwareCategory() {
        return hardwareCategory;
    }

    public void setHardwareCategory(String hardwareCategory) {
        this.hardwareCategory = hardwareCategory;
    }

    public List<Timer> getTimers() {
        return timers;
    }

    public void setTimers(List<Timer> timers) {
        this.timers = timers;
    }

    protected List<Timer> timers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HardwareState getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(HardwareState desiredState) {
        this.desiredState = desiredState;
    }

    public HardwareState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(HardwareState currentState) {
        this.currentState = currentState;
    }


}
