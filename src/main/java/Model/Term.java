package Model;

import java.util.List;

/**
 * Created by senior on 21.08.15.
 */
public class Term {
    private int duration;
    private List<Discipline> disciplines;

    public Term(int duration, List<Discipline> disciplines) {
        this.duration = duration;
        this.disciplines = disciplines;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
