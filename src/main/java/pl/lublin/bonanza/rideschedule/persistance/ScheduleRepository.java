package pl.lublin.bonanza.rideschedule.persistance;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lublin.bonanza.rideschedule.model.ScheduleEntity;

@Repository
public interface ScheduleRepository extends CrudRepository<ScheduleEntity, Long> {
}
