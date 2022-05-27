package pl.lublin.bonanza.rideschedule.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.model.ScheduleEntity;
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
    public List<ScheduleEntity> getRidingList() {
        return scheduleService.getRidingList();
    }

    @PostMapping("/riding/horse/minutes")
    public double getMinutes(@RequestBody Horse horse) {
        return scheduleService.getMinutes(horse);
    }
}
