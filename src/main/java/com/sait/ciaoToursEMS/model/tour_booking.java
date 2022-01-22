package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "tour_bookings")
public class tour_booking {
    @Id
    @GeneratedValue
    @Column(name = "tour_booking_id")
    private long tour_booking_id;
    @ManyToOne
    @JoinColumn(name = "employee_id", table = "employee")
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "day_of_tour_booking")
    private LocalDateTime day_of_tour_booking;
    @Column(name = "adminFee")
    private float adminFee;
    @Column(name = "adminDescription")
    private String adminDescription;
    @Column(name = "numOfHours")
    private int numOfHours;
    @Column(name = "rate")
    private  float rate;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public tour_booking(long tour_booking_id, long employee_id, LocalDateTime day_of_tour_booking, float adminFee,
                        String adminDescription, int numOfHours, float rate, String name, String description) {
        this.tour_booking_id = tour_booking_id;
        this.employee_id = employee_id;
        this.day_of_tour_booking = day_of_tour_booking;
        this.adminFee = adminFee;
        this.adminDescription = adminDescription;
        this.numOfHours = numOfHours;
        this.rate = rate;
        this.name = name;
        this.description = description;
    }

    public long getTour_booking_id() {
        return tour_booking_id;
    }

    public void setTour_booking_id(long tour_booking_id) {
        this.tour_booking_id = tour_booking_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public LocalDateTime getDay_of_tour_booking() {
        return day_of_tour_booking;
    }

    public void setDay_of_tour_booking(LocalDateTime day_of_tour_booking) {
        this.day_of_tour_booking = day_of_tour_booking;
    }

    public float getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(float adminFee) {
        this.adminFee = adminFee;
    }

    public String getAdminDescription() {
        return adminDescription;
    }

    public void setAdminDescription(String adminDescription) {
        this.adminDescription = adminDescription;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof tour_booking)) return false;
        tour_booking that = (tour_booking) o;
        return getTour_booking_id() == that.getTour_booking_id() && getEmployee_id() == that.getEmployee_id() && Float.compare(that.getAdminFee(), getAdminFee()) == 0 && getNumOfHours() == that.getNumOfHours() && Float.compare(that.getRate(), getRate()) == 0 && getDay_of_tour_booking().equals(that.getDay_of_tour_booking()) && getAdminDescription().equals(that.getAdminDescription()) && getName().equals(that.getName()) && getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTour_booking_id(), getEmployee_id(), getDay_of_tour_booking(), getAdminFee(), getAdminDescription(), getNumOfHours(), getRate(), getName(), getDescription());
    }

    @Override
    public String toString() {
        return "tour_booking{" +
                "tour_booking_id=" + tour_booking_id +
                ", employee_id=" + employee_id +
                ", day_of_tour_booking=" + day_of_tour_booking +
                ", adminFee=" + adminFee +
                ", adminDescription='" + adminDescription + '\'' +
                ", numOfHours=" + numOfHours +
                ", rate=" + rate +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
