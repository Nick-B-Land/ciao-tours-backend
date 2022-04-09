package com.sait.ciaoToursEMS.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.*;

/**
 * EmployeeType
 *
 * Represents the type of employee.
 * 1. HOURLY
 * 2. SALARY
 * 3. ITALIAN
 */

@Entity
public class EmployeeType {

    @Id
    @Column(name = "employee_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeTypeId;

    /**
     * The enum for a job category of the employee.
     * 1. HOURLY
     * 2. SALARY
     * 3. ITALIAN
     * 99. INACTIVE
     * @see EnumEmployeeTypes
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "description")
    private EnumEmployeeTypes description;

    public EmployeeType() {
    }

    /**
     * Getter for the employeeTypeId.
     * @return
     */
    public long getEmployeeTypeId() {
        return employeeTypeId;
    }

    /**
     * Enum for the job category of the employee.
     * @return EnumEmployeeTypes the job category of the employee.
     */
    public EnumEmployeeTypes getDescription() {
        return description;
    }

    /**
     * Setter for the job category of the employee.
     * @param description the job category of the employee.
     */
    public void setDescription(EnumEmployeeTypes description) {
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
