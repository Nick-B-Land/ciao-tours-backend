package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EmployeeType
 *
 * Represents the type of employee.
 * 1. FULL-TIME
 * 2. PART-TIME
 * 3. ITALIAN
 */

@Entity
public class EmployeeType {

    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeTypeId;

    /**
     * The enum for a job category of the employee.
     * 1. FULL-TIME
     * 2. PART-TIME
     * 3. ITALIAN
     *
     * @see EnumEmployeeTypes
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "description")
    private EnumEmployeeTypes description;

    /**
     * One to many relationship with the Employee class.
     * Many employees can have the same job category.
     * Each employee can have only one job category.
     */
    @OneToMany(mappedBy = "employeeType", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();

    /**
     * Default constructor.
     */
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

    /**
     * Getter for the employees.
     * @return List<Employee> the employees.
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Setter for the employees.
     * @param employees the employees.
     */
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
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
