package sk.tomas.app.model;

import sk.tomas.app.iam.model.enums.ExcercisesEnum;
import sk.tomas.app.model.base.Entity;

/**
 * Created by tomas on 5.3.2017.
 */
public class Excercise extends Entity {

    private ExcercisesEnum name;
    private int level;
    private int series;
    private int repetations;
    private Long timestamp;

    public Excercise() {
    }

    public ExcercisesEnum getName() {
        return name;
    }

    public void setName(ExcercisesEnum name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepetations() {
        return repetations;
    }

    public void setRepetations(int repetations) {
        this.repetations = repetations;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Excercise excercise = (Excercise) o;

        if (level != excercise.level) return false;
        if (series != excercise.series) return false;
        if (repetations != excercise.repetations) return false;
        if (name != null ? !name.equals(excercise.name) : excercise.name != null) return false;
        return timestamp != null ? timestamp.equals(excercise.timestamp) : excercise.timestamp == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + level;
        result = 31 * result + series;
        result = 31 * result + repetations;
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "uuid'" + getUuid() + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", series=" + series +
                ", repetations=" + repetations +
                ", timestamp=" + timestamp +
                '}';
    }
}
