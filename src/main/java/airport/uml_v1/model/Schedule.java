package airport.uml_v1.model;

import java.time.LocalDateTime;

public class Schedule {
    private LocalDateTime scheduledDateTime;

    public Schedule(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    public LocalDateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    @Override
    public String toString() {
        return scheduledDateTime.toString();
    }
}
