package sk.tomas.app.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by tomas on 5.3.2017.
 */

@Entity
@Table(name = "Excercise")
public class ExcerciseNode extends EntityNode {

    //nazov cvicenia
    @Column(unique = true, nullable = false, length = 50)
    private String name;

    //uroven cviku
    @Column
    private int level;

    //pocet serii
    @Column
    private int series;

    //pocet opakovani serie
    @Column
    private int repetations;

    //cas cvicenia
    private Long timestamp;

    public ExcerciseNode() {
    }

    public ExcerciseNode(String uuid, String name, int level, int series, int repetations, Long timestamp) {
        super(uuid);
        this.name = name;
        this.level = level;
        this.series = series;
        this.repetations = repetations;
        this.timestamp = timestamp;
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

        ExcerciseNode that = (ExcerciseNode) o;

        if (level != that.level) return false;
        if (series != that.series) return false;
        if (repetations != that.repetations) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return timestamp != null ? timestamp.equals(that.timestamp) : that.timestamp == null;
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
        return "ExcerciseNode{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", series=" + series +
                ", repetations=" + repetations +
                ", timestamp=" + timestamp +
                '}';
    }
}
