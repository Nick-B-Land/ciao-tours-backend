package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Objects;

//@Entity
//@Table(name = "Employee_type")
public class EmployeeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeTypeId;

    @Column(name = "description")
    private String description;

    public EmployeeType(){}

    public EmployeeType(String description) {
        this.description = description;
    }

    public long getEmployeeTypeId() {
        return employeeTypeId;
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
        if (!(o instanceof EmployeeType)) return false;
        EmployeeType that = (EmployeeType) o;
        return getEmployeeTypeId() == that.getEmployeeTypeId() && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeTypeId(), getDescription());
    }

    @Override
    public String toString() {
        return "Employee_type{" +
                "employeeTypeId=" + employeeTypeId +
                ", description='" + description + '\'' +
                '}';
    }
}
