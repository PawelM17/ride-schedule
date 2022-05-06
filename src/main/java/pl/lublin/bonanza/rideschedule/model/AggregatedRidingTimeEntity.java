package pl.lublin.bonanza.rideschedule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aggregated_riding_time")
public class AggregatedRidingTimeEntity {

    @Id
    @Column(name = "riding_time_id", nullable = false)
    private Long id;
    private String horseName;
    private double minutes;

    public AggregatedRidingTimeEntity(Long id, String horseName, double minutes) {
        this.id = id;
        this.horseName = horseName;
        this.minutes = minutes;
    }

    public AggregatedRidingTimeEntity() {
    }
}
