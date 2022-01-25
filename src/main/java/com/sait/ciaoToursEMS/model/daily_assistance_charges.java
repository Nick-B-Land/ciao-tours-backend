package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "daily_assistance_charges")
public class daily_assistance_charges {
    @Id
    @GeneratedValue
    @Column(name = "daily_assistance_charges_id")
    private long daily_assistance_charges_id;
    @ManyToOne
    @JoinColumn(name = "employee_id", table = "employee")
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;
    @Column(name = "rate_daily_Assistance")
    private float rate_daily_Assistance;

    public daily_assistance_charges(long daily_assistance_charges_id, long employee_id, Date startDate, Date endDate, float rate_daily_Assistance) {
        this.daily_assistance_charges_id = daily_assistance_charges_id;
        this.employee_id = employee_id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rate_daily_Assistance = rate_daily_Assistance;
    }

    public long getDaily_assistance_charges_id() {
        return daily_assistance_charges_id;
    }

    public void setDaily_assistance_charges_id(long daily_assistance_charges_id) {
        this.daily_assistance_charges_id = daily_assistance_charges_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getRate_daily_Assistance() {
        return rate_daily_Assistance;
    }

    public void setRate_daily_Assistance(float rate_daily_Assistance) {
        this.rate_daily_Assistance = rate_daily_Assistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof daily_assistance_charges)) return false;
        daily_assistance_charges that = (daily_assistance_charges) o;
        return getDaily_assistance_charges_id() == that.getDaily_assistance_charges_id() && getEmployee_id() == that.getEmployee_id() && Float.compare(that.getRate_daily_Assistance(), getRate_daily_Assistance()) == 0 && getStartDate().equals(that.getStartDate()) && Objects.equals(getEndDate(), that.getEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDaily_assistance_charges_id(), getEmployee_id(), getStartDate(), getEndDate(), getRate_daily_Assistance());
    }

    @Override
    public String toString() {
        return "daily_assistance_charges{" +
                "daily_assistance_charges_id=" + daily_assistance_charges_id +
                ", employee_id=" + employee_id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", rate_daily_Assistance=" + rate_daily_Assistance +
                '}';
    }
}
