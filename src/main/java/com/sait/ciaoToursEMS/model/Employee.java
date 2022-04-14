package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Employee class entity
 *
 * Contains all the information about an employee
 * Employee Types are:
 * 1-Hourly
 * 2-Salary
 * 3-Italian
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private long employeeId;

    /**
     * Employee's first name
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Employee's last name
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * Employee's street address
     */
    @Column(name = "address")
    private String address;

    /**
     * Employee's city
     */
    @Column(name = "city")
    private String city;

    /**
     * Employee's email address
     */
    @Column(name = "email_address")
    private String emailAddress;

    /**
     * Employee's Employment Type (Hourly, Salary, Italian)
     */
    @Column(name = "employee_type")
    private int employeeType;

    /**
     * Employee's Job Title
     */
    @Column(name = "job_title")
    private String jobTitle;

    /**
     * Employee's employment start date
     */
    @Column(name = "employee_start_date")
    private Date employeeStartDate;

    /**
     * Employee's employment end date
     */
    @Column(name = "employee_end_date")
    private Date employeeEndDate;

    /**
     * Employee's hourly rate
     */
    @Column(name = "hourly_wage")
    private float hourlyWage;

    /**
     * Employee's salary
     */
    @Column(name = "monthly_salary")
    private float monthlySalary;

    /**
     * Employee's bank institution id
     */
    @Column(name = "institution_id")
    private long institutionId;

    /**
     * Employee's bank account number
     */
    @Column(name = "bank_account_number")
    private long bankAccountNumber;

    /**
     * Employee's bank account transit number
     */
    @Column(name = "transit_id")
    private long transitId;

    /**
     * Employee's date of birth
     */
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    /**
     * Employee's postal code
     */
    @Column(name = "postal_code")
    private String postalCode;

    /**
     * Employee's country
     */
    @Column(name = "country")
    private String country;

    /**
     * Employee's province
     */
    @Column(name = "province")
    private String province;

    /**
     * Employee's phone number
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * Employee's active status at the company
     */
    @Column(name = "isActive")
    private int isActive;


    public Employee(){}

    /**
     * Employee constructor
     * @param employeeId employee id
     * @param firstName employee first name
     * @param lastName employee last name
     * @param address employee address
     * @param city employee city
     * @param emailAddress employee email address
     * @param employeeType employee type
     * @param jobTitle employee job title
     * @param employeeStartDate employee start date
     * @param employeeEndDate employee end date
     * @param hourlyWage employee hourly wage
     * @param monthlySalary employee monthly salary
     * @param institutionId employee bank institution id
     * @param bankAccountNumber employee bank account number
     * @param transitId employee bank transit id
     * @param dateOfBirth employee date of birth
     * @param postalCode employee postal code
     * @param country employee country
     * @param province employee province
     * @param phoneNumber employee phone number
     * @param isActive employee active status
     */
    public Employee(long employeeId, String firstName, String lastName, String address, String city, String emailAddress, int employeeType, String jobTitle, Date employeeStartDate, Date employeeEndDate, float hourlyWage, float monthlySalary,
                    long institutionId, long bankAccountNumber, long transitId, Date dateOfBirth, String postalCode, String country, String province, String phoneNumber, int isActive) {
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

    /**
     * Get employee id
     * @return employee id
     */
    public long getEmployeeId() {
        return employeeId;
    }

    /**
     * Set employee id
     * @param employeeId employee id
     */
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Get employee first name
     * @return employee first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set employee first name
     * @param firstName employee first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get employee last name
     * @return employee last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set employee last name
     * @param lastName employee last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get employee address
     * @return employee address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set employee address
     * @param address employee address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get employee city
     * @return employee city
     */
    public String getCity() {
        return city;
    }

    /**
     * Set employee city
     * @param city employee city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get employee email address
     * @return employee email address
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Set employee email address
     * @param emailAddress employee email address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Get employee type
     * @return employee type
     */
    public int getEmployeeType() {
        return employeeType;
    }

    /**
     * Set employee type
     * @param employeeType employee type
     */
    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    /**
     * Get employee job title
     * @return employee job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Set employee job title
     * @param jobTitle employee job title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Get employee start date
     * @return employee employment start date
     */
    public Date getEmployeeStartDate() {
        return employeeStartDate;
    }

    /**
     * Set employee start date
     * @param employeeStartDate employee employment start date
     */
    public void setEmployeeStartDate(Date employeeStartDate) {
        this.employeeStartDate = employeeStartDate;
    }

    /**
     * Get employee termination date
     * @return employee employment termination date
     */
    public Date getEmployeeEndDate() {
        return employeeEndDate;
    }

    /**
     * Set employee termination date
     * @param employeeEndDate employee employment termination date
     */
    public void setEmployeeEndDate(Date employeeEndDate) {
        this.employeeEndDate = employeeEndDate;
    }

    /**
     * Get employee hourly rate
     * @return employee hourly rate
     */
    public float getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Set employee hourly rate
     * @param hourlyWage employee hourly rate
     */
    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * Get employee monthly salary
     * @return employee monthly salary
     */
    public float getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * Set employee monthly salary
     * @param monthlySalary employee monthly salary
     */
    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * Get employee's bank institution id
     * @return employee's bank institution id
     */
    public long getInstitutionId() {
        return institutionId;
    }

    /**
     * Set employee's bank institution id
     * @param institutionId bank institution id
     */
    public void setInstitutionId(long institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * Get employee's bank account number
     * @return employee's bank account number
     */
    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Set employee's bank account number
     * @param bankAccountNumber bank account number
     */
    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Get employee's bank account transit id
     * @return employee's bank account transit id
     */
    public long getTransitId() {
        return transitId;
    }

    /**
     * Set employee's bank account transit id
     * @param transitId bank account transit id
     */
    public void setTransitId(long transitId) {
        this.transitId = transitId;
    }

    /**
     * Get employee's date of birth
     * @return employee's date of birth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Set employee's date of birth
     * @param dateOfBirth employee's date of birth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Get employee's postal code
     * @return employee's postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Set employee's postal code
     * @param postalCode employee's postal code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Get employee's country
     * @return employee's country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set employee's country
     * @param country employee's country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get employee's province
     * @return employee's province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Set employee's province
     * @param province employee's province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Get employee's phone number
     * @return employee's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set employee's phone number
     * @param phoneNumber employee's phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the active status of the employee (1 = active, 0 = inactive)
     * @return the active status of the employee
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Set the active status of the employee (1 = active, 0 = inactive)
     * @param isActive the active status of the employee
     */
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
        return Objects.hash(employeeId, firstName, lastName, address, city, emailAddress, employeeType, jobTitle, employeeStartDate, employeeEndDate, hourlyWage, monthlySalary, institutionId, bankAccountNumber, transitId, dateOfBirth, postalCode, country, province, phoneNumber, isActive);
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
