package frentz.daniel.model;

import java.util.ArrayList;
import java.util.List;

public class Details<T> {
    private List<T> hardware;

    public Details(){
        this.hardware = new ArrayList<>();
    }

    public List<T> getHardware() {
        return hardware;
    }

    public void setHardware(List<T> hardware) {
        this.hardware = hardware;
    }
}
