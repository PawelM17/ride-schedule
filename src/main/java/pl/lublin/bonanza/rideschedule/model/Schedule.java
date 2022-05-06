package pl.lublin.bonanza.rideschedule.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Schedule {

    private Map<Horse, List<Riding>> ridingMap = new HashMap<>();

    public void addRiding(Riding riding) {
        if (!ridingMap.containsKey(riding.getHorse())) {
            List<Riding> list = new ArrayList<>();
            list.add(riding);
            ridingMap.put(riding.getHorse(), list);
        } else {
            List<Riding> actual = ridingMap.get(riding.getHorse());
            actual.add(riding);
        }
    }

    public String getRidingList() {
        if (ridingMap.isEmpty()) {
            return "Sorry, schedule is empty";
        } else {
            return ridingMap.toString();
        }
    }

    public double getMinutes(Horse horse) {
        double total = 0.0;
        List<Riding> list = ridingMap.get(horse);
        for (Riding r : list) {
            total += r.getMinutes();
        }
        return total;
    }
}
