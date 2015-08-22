package Model;

import java.util.Date;

/**
 * Created by senior on 21.08.15.
 */
public class Student extends Person {
    private String name;
    private String secondName;
    private String group;
    private Date date;

    public Student(String name, String secondName, String group, int id, Date date) {
        this.name = name;
        this.secondName = secondName;
        this.group = group;
        super.id = id;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
