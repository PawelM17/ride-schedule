package pl.lublin.bonanza.rideschedule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.persistance.ScheduleRepository;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public void saveRiding(Riding riding) {
        scheduleRepository.saveRiding(riding);
    }

    public String getRidingList() {
        return scheduleRepository.getRidingList();
    }

    public double getMinutes(Horse horse) {
        return scheduleRepository.getMinutes(horse);
    }
}
