package sk.tomas.app.model;

import sk.tomas.app.model.base.Entity;

/**
 * Created by tomas on 5.3.2017.
 */
public class Excercise extends Entity {

    private String name;

    private int level;

    private int series;

    private int repetations;

    public Excercise() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Excercise excercise = (Excercise) o;

        if (level != excercise.level) return false;
        if (series != excercise.series) return false;
        if (repetations != excercise.repetations) return false;
        return name != null ? name.equals(excercise.name) : excercise.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + level;
        result = 31 * result + series;
        result = 31 * result + repetations;
        return result;
    }

    @Override
    public String toString() {
        return "Excercise{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", series=" + series +
                ", repetations=" + repetations +
                '}';
    }
}
