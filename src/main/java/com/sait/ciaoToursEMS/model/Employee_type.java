package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Employee_type")
public class Employee_type {
    @Id
    @GeneratedValue
    @Column(name = "employee_type_id")
    private long employee_type_id;
    @Column(name = "description")
    private String description;
    @OneToOne(mappedBy = "Employee")
    private Employee employee;
    public Employee_type(long employee_type_id, String description) {
        this.employee_type_id = employee_type_id;
        this.description = description;
    }


    public long getEmployee_type_id() {
        return employee_type_id;
    }

    public void setEmployee_type_id(long employee_type_id) {
        this.employee_type_id = employee_type_id;
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
        if (!(o instanceof Employee_type)) return false;
        Employee_type that = (Employee_type) o;
        return getEmployee_type_id() == that.getEmployee_type_id() && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee_type_id(), getDescription());
    }

    @Override
    public String toString() {
        return "Employee_type{" +
                "employee_type_id=" + employee_type_id +
                ", description='" + description + '\'' +
                '}';
    }
}
