package pl.lublin.bonanza.rideschedule.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "schedule")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schedule_id", nullable = false)
    private Long id;
    private String horseName;
    private String riderName;
    private double minutes;

    public ScheduleEntity(String horseName, String riderName, double minutes) {
        this.horseName = horseName;
        this.riderName = riderName;
        this.minutes = minutes;
    }
}
