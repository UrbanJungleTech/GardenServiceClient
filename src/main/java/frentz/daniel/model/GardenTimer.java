package frentz.daniel.model;


import frentz.daniel.hardwareservice.client.model.Timer;

public class GardenTimer {
    private long timerGroup;
    private Timer timer;

    public long getTimerGroup() {
        return timerGroup;
    }

    public void setTimerGroup(long timerGroup) {
        this.timerGroup = timerGroup;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}
