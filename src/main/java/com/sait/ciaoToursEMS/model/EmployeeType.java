package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Objects;

/**
 * EmployeeType
 * Contains the employee type information
 *
 */
@Entity
@Table(name = "Employee_type")
public class EmployeeType {
    /**
     * Employee type id (primary key)
     * 1 - Hourly
     * 2 - Salaried
     * 3 - Italian
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeTypeId;

    /**
     * Employee type name
     */
    @Column(name = "description")
    private String description;

    public EmployeeType(){}

    /**
     * Constructor
     * @param employeeTypeId Employee type id
     * @param description Employee type name
     */
    public EmployeeType(long employeeTypeId, String description) {
        this.employeeTypeId = employeeTypeId;
        this.description = description;
    }

    /**
     * Get employee type id
     * @return Employee type id
     */
    public long getEmployeeTypeId() {
        return employeeTypeId;
    }

    /**
     * Set employee type id
     * @param employeeTypeId Employee type id
     */
    public void setEmployeeTypeId(long employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    /**
     * Get employee type name
     * @return Employee type name
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set employee type name
     * @param description Employee type name
     */
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
