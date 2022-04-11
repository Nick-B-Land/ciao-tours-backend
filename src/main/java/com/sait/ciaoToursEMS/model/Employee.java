package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


//employee types: 0-Hourly 1-Salary 2-Italian
@Entity
@Table(name = "employee")
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

    @Column(name = "employee_type")
    private int employeeType;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "employee_start_date")
    private Date employeeStartDate;

    @Column(name = "employee_end_date")
    private Date employeeEndDate;

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

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "province")
    private String province;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "isActive")
    private int isActive;

    public Employee(){}

    public Employee(long employeeId, String firstName, String lastName, String address, String city, String emailAddress, int employeeType, String jobTitle, Date employeeStartDate, Date employeeEndDate, float hourlyWage, float monthlySalary, long isAdmin, long isBookeeper, long institutionId, long bankAccountNumber, long transitId, Date dateOfBirth, String postalCode, String country, String province, String phoneNumber, int isActive) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.employeeType = employeeType;
        this.jobTitle = jobTitle;
        this.employeeStartDate = employeeStartDate;
        this.employeeEndDate = employeeEndDate;
        this.hourlyWage = hourlyWage;
        this.monthlySalary = monthlySalary;
        this.isAdmin = isAdmin;
        this.isBookeeper = isBookeeper;
        this.institutionId = institutionId;
        this.bankAccountNumber = bankAccountNumber;
        this.transitId = transitId;
        this.dateOfBirth = dateOfBirth;
        this.postalCode = postalCode;
        this.country = country;
        this.province = province;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId &&
                employeeType == employee.employeeType &&
                Float.compare(employee.hourlyWage, hourlyWage) == 0 &&
                Float.compare(employee.monthlySalary, monthlySalary) == 0 &&
                isAdmin == employee.isAdmin &&
                isBookeeper == employee.isBookeeper &&
                institutionId == employee.institutionId &&
                bankAccountNumber == employee.bankAccountNumber &&
                transitId == employee.transitId &&
                isActive == employee.isActive &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(address, employee.address) &&
                Objects.equals(city, employee.city) &&
                Objects.equals(emailAddress, employee.emailAddress) &&
                Objects.equals(jobTitle, employee.jobTitle) &&
                Objects.equals(employeeStartDate, employee.employeeStartDate) &&
                Objects.equals(employeeEndDate, employee.employeeEndDate) &&
                Objects.equals(dateOfBirth, employee.dateOfBirth) &&
                Objects.equals(postalCode, employee.postalCode) &&
                Objects.equals(country, employee.country) &&
                Objects.equals(province, employee.province) &&
                Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, address, city, emailAddress, employeeType, jobTitle, employeeStartDate, employeeEndDate, hourlyWage, monthlySalary, isAdmin, isBookeeper, institutionId, bankAccountNumber, transitId, dateOfBirth, postalCode, country, province, phoneNumber, isActive);
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
                ", employeeType=" + employeeType +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeStartDate=" + employeeStartDate +
                ", employeeEndDate=" + employeeEndDate +
                ", hourlyWage=" + hourlyWage +
                ", monthlySalary=" + monthlySalary +
                ", isAdmin=" + isAdmin +
                ", isBookeeper=" + isBookeeper +
                ", institutionId=" + institutionId +
                ", bankAccountNumber=" + bankAccountNumber +
                ", transitId=" + transitId +
                ", dateOfBirth=" + dateOfBirth +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
