package pl.lublin.bonanza.rideschedule.persistance;

import org.springframework.stereotype.Repository;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.model.Schedule;

@Repository
public class ScheduleRepository {

    private Schedule schedule = new Schedule();

    public void saveRiding(Riding riding) {
        schedule.addRiding(riding);
    }

    public String getRidingList() {
        return schedule.getRidingList();
    }
    public double getMinutes (Horse horse){
        return schedule.getMinutes(horse);
    }
}
