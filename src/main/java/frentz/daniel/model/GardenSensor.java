package frentz.daniel.model;

public class GardenSensor {
    private long id;
    private long port;
    private String name;
    private boolean status;
    private double lastReadValue;
    private String unit;
    private String sensorType;

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLastReadValue() {
        return lastReadValue;
    }

    public void setLastReadValue(double lastReadValue) {
        this.lastReadValue = lastReadValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
