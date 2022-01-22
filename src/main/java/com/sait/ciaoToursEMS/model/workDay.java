package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "workDay")
public class workDay {
    @Id
    @GeneratedValue
    @Column(name = "workday_id" )
    private long workday_id;
    @ManyToOne
    @JoinColumn(name = "employee_id", table = "employee")
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "noOfHours")
    private int noOfHours;
    @Column(name = "day_of_expense")
    private LocalDateTime date_of_workDay;

    public workDay(long workday_id, long employee_id, int noOfHours, LocalDateTime date_of_workDay) {
        this.workday_id = workday_id;
        this.employee_id = employee_id;
        this.noOfHours = noOfHours;
        this.date_of_workDay = date_of_workDay;
    }
    public long getWorkday_id() {
        return workday_id;
    }

    public void setWorkday_id(long workday_id) {
        this.workday_id = workday_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public LocalDateTime getDate_of_workDay() {
        return date_of_workDay;
    }

    public void setDate_of_workDay(LocalDateTime date_of_workDay) {
        this.date_of_workDay = date_of_workDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof workDay)) return false;
        workDay workDay = (workDay) o;
        return getWorkday_id() == workDay.getWorkday_id() && getEmployee_id() == workDay.getEmployee_id() && getNoOfHours() == workDay.getNoOfHours() && Objects.equals(getDate_of_workDay(), workDay.getDate_of_workDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWorkday_id(), getEmployee_id(), getNoOfHours(), getDate_of_workDay());
    }

    @Override
    public String toString() {
        return "workDay{" +
                "workday_id=" + workday_id +
                ", employee_id=" + employee_id +
                ", noOfHours=" + noOfHours +
                ", date_of_workDay=" + date_of_workDay +
                '}';
    }
}
