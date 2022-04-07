package com.sait.ciaoToursEMS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.*;

/**
 * Employee class
 *
 * This class is used to represent an employee in the database.
 * It contains all the information about the employee, including
 * their name, email, phone number, and the employee's role.
 */

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private long employeeId;

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
    private Date employeeStartDate;

    @Column(name = "employee_end_date")
    private Date employeeEndDate;

    @Column(name = "hourly_wage")
    private float hourlyWage;

    @Column(name = "monthly_salary")
    private float monthlySalary;

    @Column(name = "institution_id")
    private long institutionId;

    @Column(name = "bank_account_number")
    private long bankAccountNumber;

    @Column(name = "transit_id")
    private long transitId;

    @Column(name = "enabled", nullable = false)
    private Boolean isEnabled = true;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private EmployeeType employeeType;

    @JsonManagedReference
    @OneToMany(mappedBy = "employee", orphanRemoval = true)
    private Set<Payroll> payrolls = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    //@OrderBy("paystubs.date_of_paystub DESC")
    private List<Paystub> paystubs = new ArrayList<>();

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Employee(){}

    public Employee (long employeeId) {
        this.employeeId = employeeId;
    }

    public Employee(Set<EmployeeType> roles, String firstName, String lastName, String address,
                    String city, String emailAddress, Date employeeStartDate, Date employeeEndDate,
                    float hourlyWage, float monthlySalary, long institutionId,long bankAccountNumber, long transitId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.employeeStartDate = employeeStartDate;
        this.employeeEndDate = employeeEndDate;
        this.hourlyWage = hourlyWage;
        this.monthlySalary = monthlySalary;
        this.institutionId = institutionId;
        this.bankAccountNumber = bankAccountNumber;
        this.transitId = transitId;
    }

    /*
    Getters and Setters
     */

    /**
     * Gets the employee ID
     * @return a long representing the employee ID
     */
    public long getEmployeeId() {
        return employeeId;
    }

    /**
     * Gets the employee's first name
     * @return a String representing the employee's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the employee's first name
     * @param firstName a String representing the employee's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the employee's last name
     * @return a String representing the employee's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the employee's last name
     * @param lastName a String representing the employee's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the employee's address
     * @return a String representing the employee's address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the employee's address
     * @param address a String representing the employee's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the employee's city
     * @return a String representing the employee's city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the employee's city
     * @param city a String representing the employee's city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the employee's email address
     * @return a String representing the employee's email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the employee's email address
     * @param emailAddress a String representing the employee's email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Gets the employee's start date
     * @return a Date representing the employee's start date
     */
    public Date getEmployeeStartDate() {
        return employeeStartDate;
    }

    /**
     * Sets the employee's start date
     * @param employeeStartDate a Date representing the employee's start date
     */
    public void setEmployeeStartDate(Date employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    /**
     * Gets the employee's end date
     * @return a Date representing the employee's end date
     */
    public Date getEmployeeEndDate() {
        return employeeEndDate;
    }

    /**
     * Sets the employee's end date
     * @param employeeEndDate a Date representing the employee's end date
     */
    public void setEmployeeEndDate(Date employeeEndDate) {
        this.employeeEndDate = employeeEndDate;
    }

    /**
     * Gets the employee's hourly wage
     * @return a float representing the employee's hourly wage
     */
    public float getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Sets the employee's hourly wage
     * @param hourlyWage a float representing the employee's hourly wage
     */
    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * Gets the employee's monthly salary
     * @return a float representing the employee's monthly salary
     */
    public float getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Sets the employee's monthly salary
     * @param monthlySalary a float representing the employee's monthly salary
     */
    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * Gets the employee's bank institution number
     * @return a long representing the employee's bank institution number
     */
    public long getInstitutionId() {
        return institutionId;
    }

    /**
     * Sets the employee's bank institution number
     * @param institutionId a long representing the employee's bank institution number
     */
    public void setInstitutionId(long institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * Gets the employee's bank account number
     * @return a long representing the employee's bank account number
     */
    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the employee's bank account number
     * @param bankAccountNumber a long representing the employee's bank account number
     */
    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Gets the employee's bank transit number
     * @return a String representing the employee's bank transit number
     */
    public long getTransitId() {
        return transitId;
    }

    /**
     * Sets the employee's bank transit number
     * @param transitId a String representing the employee's bank transit number
     */
    public void setTransitId(long transitId) {
        this.transitId = transitId;
    }

    /**
     * A boolean that allows for the employee to be active or inactive
     * @return a boolean representing the employee's active status
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the employee's active status
     * @param isEnabled a boolean representing the employee's active status
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * Gets all paystubs objects for the employee as a list
     * @return  a list of paystubs objects for the employee
     */
    public List<Paystub> getPaystubs() {
        return paystubs;
    }

    /**
     * Sets all paystubs objects for the employee as a list
     * @param paystubs a list of paystubs objects for the employee
     */
    public void setPaystubs(List<Paystub> paystubs) {
        this.paystubs = paystubs;
    }

    /**
     * Sets the employee's payroll objects as a set
     * @param payrolls a set of the employees' payroll objects
     */
    public void setPayrolls(Set<Payroll> payrolls) {
        this.payrolls = payrolls;
    }

    /**
     * Gets the employee's payroll objects as a set
     * @return a set of the employees' payroll objects
     */
    public Set<Payroll> getPayrolls() {
        return payrolls;
    }

    /*
    Other Methods
     */

    /**
     * Add a paystub to the employee's paystubs list
     * @param paystub a paystub object to be added to the employee's paystubs list
     */
    public void addPaystub(Paystub paystub) {
        this.paystubs.add(paystub);
    }

    /**
     * Add a payroll to the employee's payrolls set
     * @param payroll a payroll object to be added to the employee's payrolls set
     */
    public void addPayroll(Payroll payroll){
        payrolls.add(payroll);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId() && Float.compare(employee.getHourlyWage(), getHourlyWage()) == 0 && Float.compare(employee.getMonthlySalary(), getMonthlySalary()) == 0 && getInstitutionId() == employee.getInstitutionId() && getBankAccountNumber() == employee.getBankAccountNumber() && getTransitId() == employee.getTransitId() && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getCity(), employee.getCity()) && Objects.equals(getEmailAddress(), employee.getEmailAddress()) && Objects.equals(getEmployeeStartDate(), employee.getEmployeeStartDate()) && Objects.equals(getEmployeeEndDate(), employee.getEmployeeEndDate()) && Objects.equals(getIsEnabled(), employee.getIsEnabled()) && Objects.equals(getEmployeeType(), employee.getEmployeeType()) && Objects.equals(getPayrolls(), employee.getPayrolls());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getEmployeeStartDate(), getEmployeeEndDate(), getHourlyWage(), getMonthlySalary(), getInstitutionId(), getBankAccountNumber(), getTransitId(), getIsEnabled(), getEmployeeType(), getPayrolls());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", employeeStartDate=" + employeeStartDate +
                ", employeeEndDate=" + employeeEndDate +
                ", hourlyWage=" + hourlyWage +
                ", monthlySalary=" + monthlySalary +
                ", institutionId=" + institutionId +
                ", bankAccountNumber=" + bankAccountNumber +
                ", transitId=" + transitId +
                ", isEnabled=" + isEnabled +
                ", employeeType=" + employeeType +
                ", payrolls=" + payrolls +
                '}';
    }
}
