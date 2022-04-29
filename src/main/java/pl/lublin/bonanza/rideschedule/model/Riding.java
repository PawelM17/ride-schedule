package pl.lublin.bonanza.rideschedule.model;

public class Riding {
    private Rider rider;
    private Horse horse;
    private double minutes;

    public Riding(Rider rider, Horse horse, double minutes) {
        this.rider = rider;
        this.horse = horse;
        this.minutes = minutes;
    }

    public Rider getRider() {
        return rider;
    }

    public Horse getHorse() {
        return horse;
    }

    public double getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "Riding:" +
            "rider=" + rider +
            ", horse=" + horse +
            ", minutes=" + minutes;
    }
}
