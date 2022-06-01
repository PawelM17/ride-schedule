package pl.lublin.bonanza.rideschedule.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "riding")
public class RidingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "riding_id", nullable = false)
    private Long id;
    private String horseName;
    private String riderName;
    private double minutes;

    public RidingEntity(String horseName, String riderName, double minutes) {
        this.horseName = horseName;
        this.riderName = riderName;
        this.minutes = minutes;
    }
}
