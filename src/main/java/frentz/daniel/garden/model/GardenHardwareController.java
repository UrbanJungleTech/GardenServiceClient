package frentz.daniel.garden.model;


public class GardenHardwareController {
    private Long id;
    private String name;
    private String serialNumber;
    private HardwareDetails hardwareDetails;
    private SensorDetails sensorDetails;

    public GardenHardwareController(){
        this.hardwareDetails = new HardwareDetails();
        this.sensorDetails = new SensorDetails();
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

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public HardwareDetails getHardwareDetails() {
        return hardwareDetails;
    }

    public void setHardwareDetails(HardwareDetails hardwareDetails) {
        this.hardwareDetails = hardwareDetails;
    }

    public SensorDetails getSensorDetails() {
        return sensorDetails;
    }

    public void setSensorDetails(SensorDetails sensorDetails) {
        this.sensorDetails = sensorDetails;
    }
}
