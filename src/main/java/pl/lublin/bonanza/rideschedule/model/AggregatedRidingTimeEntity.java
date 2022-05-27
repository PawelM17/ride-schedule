package pl.lublin.bonanza.rideschedule.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "aggregated_riding_time")
public class AggregatedRidingTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "riding_time_id", nullable = false)
    private Long id;
    private String horseName;
    private double minutes;
}


