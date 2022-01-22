package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "daysOff")
public class daysOff {
    @Id
    @GeneratedValue
    @Column(name = "days_off_id" )
    private long days_off_id ;
    @ManyToOne
    @JoinColumn(name = "employee_id", table = "employee")
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "date_of_dayOff")
    private  Date date_of_dayOff;

    public daysOff(long days_off_id, long employee_id, Date date_of_dayOff) {
        this.days_off_id = days_off_id;
        this.employee_id = employee_id;
        this.date_of_dayOff = date_of_dayOff;
    }

    public long getDays_off_id() {
        return days_off_id;
    }

    public void setDays_off_id(long days_off_id) {
        this.days_off_id = days_off_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public Date getDate_of_dayOff() {
        return date_of_dayOff;
    }

    public void setDate_of_dayOff(Date date_of_dayOff) {
        this.date_of_dayOff = date_of_dayOff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof daysOff)) return false;
        daysOff daysOff = (daysOff) o;
        return getDays_off_id() == daysOff.getDays_off_id() && getEmployee_id() == daysOff.getEmployee_id() && Objects.equals(getDate_of_dayOff(), daysOff.getDate_of_dayOff());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDays_off_id(), getEmployee_id(), getDate_of_dayOff());
    }

    @Override
    public String toString() {
        return "daysOff{" +
                "days_off_id=" + days_off_id +
                ", employee_id=" + employee_id +
                ", date_of_dayOff=" + date_of_dayOff +
                '}';
    }
}
