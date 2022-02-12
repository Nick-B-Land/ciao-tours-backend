package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private long employeeId;

    @ManyToMany
    @JoinTable(name = "EID_ETID",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_type_id"))
    private Set<Employee_type> roles = new HashSet<>();

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "employee_start_date")
    private LocalDateTime employeeStartDate;

    @Column(name = "employee_end_date")
    private LocalDateTime employeeEndDate;

    @Column(name = "hourly_wage")
    private float hourlyWage;

    @Column(name = "monthly_salary")
    private float monthlySalary;

    @Column(name = "is_admin")
    private long isAdmin;

    @Column(name = "is_bookeeper")
    private long isBookeeper;

    @Column(name = "institution_id")
    private long institutionId;

    @Column(name = "bank_account_number")
    private long bankAccountNumber;

    @Column(name = "transit_id")
    private long transitId;

    public Employee(long employeeId, Set<Employee_type> roles, String firstName, String lastName, String address, String city, String emailAddress, LocalDateTime employeeStartDate, LocalDateTime employeeEndDate, float hourlyWage, float monthlySalary, long isAdmin, long isBookeeper, long institutionId, long bankAccountNumber, long transitId) {
        this.employeeId = employeeId;
        this.roles = roles;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.employeeStartDate = employeeStartDate;
        this.employeeEndDate = employeeEndDate;
        this.hourlyWage = hourlyWage;
        this.monthlySalary = monthlySalary;
        this.isAdmin = isAdmin;
        this.isBookeeper = isBookeeper;
        this.institutionId = institutionId;
        this.bankAccountNumber = bankAccountNumber;
        this.transitId = transitId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Set<Employee_type> getRoles() {
        return roles;
    }

    public void setRoles(Set<Employee_type> roles) {
        this.roles = roles;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDateTime getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(LocalDateTime employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public LocalDateTime getEmployeeEndDate() {
        return employeeEndDate;
    }

    public void setEmployeeEndDate(LocalDateTime employeeEndDate) {
        this.employeeEndDate = employeeEndDate;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public long getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(long isAdmin) {
        this.isAdmin = isAdmin;
    }

    public long getIsBookeeper() {
        return isBookeeper;
    }

    public void setIsBookeeper(long isBookeeper) {
        this.isBookeeper = isBookeeper;
    }

    public long getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(long institutionId) {
        this.institutionId = institutionId;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getTransitId() {
        return transitId;
    }

    public void setTransitId(long transitId) {
        this.transitId = transitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId() && Float.compare(employee.getHourlyWage(), getHourlyWage()) == 0 && Float.compare(employee.getMonthlySalary(), getMonthlySalary()) == 0 && getIsAdmin() == employee.getIsAdmin() && getIsBookeeper() == employee.getIsBookeeper() && getInstitutionId() == employee.getInstitutionId() && getBankAccountNumber() == employee.getBankAccountNumber() && getTransitId() == employee.getTransitId() && Objects.equals(getRoles(), employee.getRoles()) && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getCity(), employee.getCity()) && Objects.equals(getEmailAddress(), employee.getEmailAddress()) && Objects.equals(getEmployeeStartDate(), employee.getEmployeeStartDate()) && Objects.equals(getEmployeeEndDate(), employee.getEmployeeEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getRoles(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getEmployeeStartDate(), getEmployeeEndDate(), getHourlyWage(), getMonthlySalary(), getIsAdmin(), getIsBookeeper(), getInstitutionId(), getBankAccountNumber(), getTransitId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", roles=" + roles +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", employeeStartDate=" + employeeStartDate +
                ", employeeEndDate=" + employeeEndDate +
                ", hourlyWage=" + hourlyWage +
                ", monthlySalary=" + monthlySalary +
                ", isAdmin=" + isAdmin +
                ", isBookeeper=" + isBookeeper +
                ", institutionId=" + institutionId +
                ", bankAccountNumber=" + bankAccountNumber +
                ", transitId=" + transitId +
                '}';
    }
}
