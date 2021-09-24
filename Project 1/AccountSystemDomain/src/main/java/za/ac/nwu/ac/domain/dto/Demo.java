package za.ac.nwu.ac.domain.dto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Demo {
    private Date dateCreated;
    private String name;
    private int days;

    public Demo() {
    }

    public Demo(Date dateCreated, String name, int days) {
        this.dateCreated = dateCreated;
        this.name = name;
        this.days = days;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
