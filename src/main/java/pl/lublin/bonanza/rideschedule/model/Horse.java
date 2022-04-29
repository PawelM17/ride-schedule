package pl.lublin.bonanza.rideschedule.model;

public class Horse {
    private String name;
    private String race;

    public Horse(String name, String race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "Horse:" +
            "name='" + name + '\'' +
            ", race='" + race + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Horse horse = (Horse) o;

        if (name != null ? !name.equals(horse.name) : horse.name != null) {
            return false;
        }
        return race != null ? race.equals(horse.race) : horse.race == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (race != null ? race.hashCode() : 0);
        return result;
    }
}
