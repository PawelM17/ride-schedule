package pl.lublin.bonanza.rideschedule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.model.RidingEntity;
import pl.lublin.bonanza.rideschedule.persistance.ScheduleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public void saveRiding(Riding riding) {
        scheduleRepository.save(new RidingEntity(riding.getHorse().getName(), riding.getRider().getFirstName(), riding.getMinutes()));
    }

    public List<RidingEntity> getRidingList() {
        return (List<RidingEntity>) scheduleRepository.findAll();
    }

    public Double getMinutes(Horse horse) {
        return scheduleRepository.sumMinutes(horse.getName());
    }
}
