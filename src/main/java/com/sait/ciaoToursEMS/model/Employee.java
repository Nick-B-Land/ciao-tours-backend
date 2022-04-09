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

    //<editor-fold desc="Fields">
    @Column(name = "first_name")
    private String firstName;
                                             
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "country")
    private String country;

    @Column(name = "province")
    private String province;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

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
    private int isEnabled = 1;

    @Column(name = "title")
    private String JobTitle;
    //</editor-fold>

    //<editor-fold desc="Relational Fields">
    /**
     * One-to-many relationship with the {@link com.sait.ciaoToursEMS.model.Payroll} Entity.
     * One employee can have many payroll entities.
     * Many paystubs can be generated for one employee.
     */
    @JsonManagedReference
    @OneToMany(mappedBy = "employee", orphanRemoval = true)
    private Set<Payroll> payrolls = new LinkedHashSet<>();

    /**
     * One-to-many relationship with the {@link com.sait.ciaoToursEMS.model.Paystub} Entity.
     * One employee can have many paystubs.
     * Many paystubs can be generated for one employee.
     */
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Paystub> paystubs = new ArrayList<>();

    /**
     * Many-to-one relationship with the {@link com.sait.ciaoToursEMS.model.EmployeeType} Entity.
     * Many employees can have the same job category.
     * Each employee can have only one job category.
     */
    @ManyToOne
    @JoinColumn(name = "employee_type_id")
    private EmployeeType employeeType;
    //</editor-fold>

    //<editor-fold desc="Constructors">
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
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
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
     * Gets the employee's country
     * @return a String representing the employee's country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the employee's country
     * @param country a String representing the employee's country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the employee's province
     * @return a String representing the employee's province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the employee's province
     * @param province a String representing the employee's province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Gets the employee's postal code
     * @return a String representing the employee's postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the employee's postal code
     * @param postalCode a String representing the employee's postal code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the employee's date of birth
     * @return a Date representing the employee's date of birth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the employee's date of birth
     * @param dateOfBirth a Date representing the employee's date of birth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the employee's job role
     * @return a String representing the employee's job title
     */
    public String getJobTitle() {
        return JobTitle;
    }

    /**
     * Sets the employee's job role
     * @param jobTitle a String representing the employee's job title
     */
    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
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
     * @return an int representing the employee's active status
     */
    public int getIsEnabled() {
        return isEnabled;
    }

    /**
     * Sets the employee's active status
     * @param isEnabled an int representing the employee's active status
     */
    public void setIsEnabled(int isEnabled) {
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

    /**
     * Gets an EmployeeType object representing the employee's type
     * @return EmployeeType object representing the employee's type
     */
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets an EmployeeType object representing the employee's type
     * @param employeeType EmployeeType object representing the employee's type
     */
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
    //</editor-fold>

    //<editor-fold desc="Methods">
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
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId() && Float.compare(employee.getHourlyWage(),
                getHourlyWage()) == 0 && Float.compare(employee.getMonthlySalary(),
                getMonthlySalary()) == 0 &&
                getInstitutionId() == employee.getInstitutionId() &&
                getBankAccountNumber() == employee.getBankAccountNumber() &&
                getTransitId() == employee.getTransitId() &&
                getFirstName().equals(employee.getFirstName()) &&
                getLastName().equals(employee.getLastName()) &&
                getAddress().equals(employee.getAddress()) &&
                country.equals(employee.country) &&
                province.equals(employee.province) &&
                postalCode.equals(employee.postalCode) &&
                dateOfBirth.equals(employee.dateOfBirth) &&
                getCity().equals(employee.getCity()) &&
                getEmailAddress().equals(employee.getEmailAddress()) &&
                getEmployeeStartDate().equals(employee.getEmployeeStartDate()) &&
                getEmployeeEndDate().equals(employee.getEmployeeEndDate()) &&
                getIsEnabled().equals(employee.getIsEnabled()) &&
                JobTitle.equals(employee.JobTitle) &&
                getPayrolls().equals(employee.getPayrolls()) &&
                getPaystubs().equals(employee.getPaystubs()) &&
                getEmployeeType().equals(employee.getEmployeeType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeId(),
                getFirstName(),
                getLastName(),
                getAddress(),
                country,
                province,
                postalCode,
                dateOfBirth,
                getCity(),
                getEmailAddress(),
                getEmployeeStartDate(),
                getEmployeeEndDate(),
                getHourlyWage(),
                getMonthlySalary(),
                getInstitutionId(),
                getBankAccountNumber(),
                getTransitId(),
                getIsEnabled(),
                JobTitle,
                getPayrolls(),
                getPaystubs(),
                getEmployeeType());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", dateOfBirth=" + dateOfBirth +
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
                ", JobTitle='" + JobTitle + '\'' +
                ", payrolls=" + payrolls +
                ", paystubs=" + paystubs +
                ", employeeType=" + employeeType +
                '}';
    }

    //</editor-fold>
}