package pl.lublin.bonanza.rideschedule.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lublin.bonanza.rideschedule.model.Horse;
import pl.lublin.bonanza.rideschedule.model.Riding;
import pl.lublin.bonanza.rideschedule.service.ScheduleService;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping("/riding")
    public void saveRiding(@RequestBody Riding riding) {
        scheduleService.saveRiding(riding);
    }

    @GetMapping("/riding")
    public String getRidingList() {
        return scheduleService.getRidingList();
    }

    @PostMapping("/riding/horse/minutes")
    public double getMinutes(@RequestBody Horse horse) {
        return scheduleService.getMinutes(horse);
    }
}
