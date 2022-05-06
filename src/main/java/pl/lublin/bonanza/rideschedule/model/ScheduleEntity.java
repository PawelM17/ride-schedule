package pl.lublin.bonanza.rideschedule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class ScheduleEntity {

    @Id
    @Column(name = "schedule_id", nullable = false)
    private Long id;
    private String horseName;
    private String riderName;
    private double minutes;

    public ScheduleEntity(Long id, String horseName, String riderName, double minutes) {
        this.id = id;
        this.horseName = horseName;
        this.riderName = riderName;
        this.minutes = minutes;
    }

    public ScheduleEntity() {
    }
}
