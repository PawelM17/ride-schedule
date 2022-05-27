package pl.lublin.bonanza.rideschedule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.model.ScheduleEntity;
import pl.lublin.bonanza.rideschedule.persistance.ScheduleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public void saveRiding(Riding riding) {
        scheduleRepository.save(new ScheduleEntity(riding.getHorse().getName(), riding.getRider().getFirstName(), riding.getMinutes()));
    }

    public List<ScheduleEntity> getRidingList() {
        return (List<ScheduleEntity>) scheduleRepository.findAll();
    }

    public double getMinutes(Horse horse) {
        //todo implement
        return 0.0;
    }
}
