package pl.lublin.bonanza.rideschedule.persistance;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.lublin.bonanza.rideschedule.model.RidingEntity;

@Repository
public interface ScheduleRepository extends CrudRepository<RidingEntity, Long> {
    @Query(value = "select SUM(re.minutes) FROM RidingEntity re WHERE re.horseName = :name")
    Double sumMinutes(@Param("name") String name);
}
