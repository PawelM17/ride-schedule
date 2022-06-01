package pl.lublin.bonanza.rideschedule.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.model.RidingEntity;
import pl.lublin.bonanza.rideschedule.service.ScheduleService;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/riding")
    public void saveRiding(@RequestBody Riding riding) {
        scheduleService.saveRiding(riding);
    }

    @GetMapping("/riding")
    public List<RidingEntity> getRidingList() {
        return scheduleService.getRidingList();
    }

    @GetMapping("/riding/horse/minutes")
    public Double getMinutes(@RequestBody Horse horse) {
        return scheduleService.getMinutes(horse);
        //todo replace horse to horseName
    }
}
