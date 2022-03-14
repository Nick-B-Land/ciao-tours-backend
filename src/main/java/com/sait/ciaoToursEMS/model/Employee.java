package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private long employeeId;

    @ManyToMany
    @JoinTable(name = "EID_ETID",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_type_id"))
    private Set<EmployeeType> roles = new HashSet<>();

    @Column(name = "first_name")
    private String firstName;
                                             
    @Column(name = "last_name")
    private String lastName;

    @Embedded
    private Address address;

    @Embedded
    private BankInformation bankInformation;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "employee_start_date")
    private Date employeeStartDate;

    @Column(name = "employee_end_date")
    private Date employeeEndDate;

    @Column(name = "hourly_wage")
    private float hourlyWage;

    @Column(name = "monthly_salary")
    private float monthlySalary;

    public Employee(){}

    public Employee(long employeeId, Set<EmployeeType> roles, String firstName, String lastName, String address,
                    String city, String emailAddress, Date employeeStartDate, Date employeeEndDate,
                    float hourlyWage, float monthlySalary, long institutionId,
                    long bankAccountNumber, long transitId) {
        this.employeeId = employeeId;
        this.roles = roles;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address.setAddress(address);
        this.address.setCity(city);
        this.emailAddress = emailAddress;
        this.employeeStartDate = employeeStartDate;
        this.employeeEndDate = employeeEndDate;
        this.hourlyWage = hourlyWage;
        this.monthlySalary = monthlySalary;
        this.bankInformation.setInstitutionID(institutionId);
        this.bankInformation.setBankAccountNumber(bankAccountNumber);
        this.bankInformation.setTransitNumber(transitId);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Set<EmployeeType> getRoles() {
        return roles;
    }

    public void setRoles(Set<EmployeeType> roles) {
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
        return address.getAddress();
    }

    public void setAddress(String address) {
        this.address.setAddress(address);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getEmployeeStartDate() {
        return employeeStartDate;
    }

    public void setEmployeeStartDate(Date employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    public Date getEmployeeEndDate() {
        return employeeEndDate;
    }

    public void setEmployeeEndDate(Date employeeEndDate) {
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

    public long getInstitutionId() {
        return bankInformation.getInstitutionID();
    }

    public void setInstitutionId(long institutionId) {
        bankInformation.setInstitutionID(institutionId);
    }

    public long getBankAccountNumber() {
        return bankInformation.getBankAccountNumber();
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        bankInformation.setBankAccountNumber(bankAccountNumber);
    }

    public long getTransitId() {
        return bankInformation.getTransitNumber();
    }

    public void setTransitId(long transitId) {
        bankInformation.setTransitNumber(transitId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId()
                && Float.compare(employee.getHourlyWage(), getHourlyWage()) == 0
                && Float.compare(employee.getMonthlySalary(), getMonthlySalary()) == 0
                && getInstitutionId() == employee.getInstitutionId()
                && getBankAccountNumber() == employee.getBankAccountNumber()
                && getTransitId() == employee.getTransitId() && Objects.equals(getRoles(), employee.getRoles())
                && Objects.equals(getFirstName(), employee.getFirstName())
                && Objects.equals(getLastName(), employee.getLastName())
                && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getCity(), employee.getCity())
                && Objects.equals(getEmailAddress(), employee.getEmailAddress())
                && Objects.equals(getEmployeeStartDate(), employee.getEmployeeStartDate())
                && Objects.equals(getEmployeeEndDate(), employee.getEmployeeEndDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getRoles(), getFirstName(), getLastName(), getAddress(), getCity(),
                getEmailAddress(), getEmployeeStartDate(), getEmployeeEndDate(), getHourlyWage(), getMonthlySalary(),
                getInstitutionId(), getBankAccountNumber(), getTransitId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", roles=" + roles +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address.getAddress() + '\'' +
                ", city='" + address.getCity() + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", employeeStartDate=" + employeeStartDate +
                ", employeeEndDate=" + employeeEndDate +
                ", hourlyWage=" + hourlyWage +
                ", monthlySalary=" + monthlySalary +
                ", institutionId=" + bankInformation.getInstitutionID() +
                ", bankAccountNumber=" + bankInformation.getBankAccountNumber() +
                ", transitId=" + bankInformation.getTransitNumber() +
                '}';
    }
}
