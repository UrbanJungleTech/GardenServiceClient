package frentz.daniel.garden.model;

import java.util.List;

public class TimerGroup {
    private String cronExpression;
    private long id;
    private List<Long> timers;

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Long> getTimers() {
        return timers;
    }

    public void setTimers(List<Long> timers) {
        this.timers = timers;
    }
}
