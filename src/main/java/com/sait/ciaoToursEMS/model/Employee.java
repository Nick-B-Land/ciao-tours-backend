package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    @ManyToMany
    @JoinTable(name = "EID_ETID",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_type_id"))
    private Set<Employee_type> roles =  new HashSet<>();

    @OneToOne
    @JoinColumn(name = "login_id")
    private login login;

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

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "sick_days")
    private float sickDays;

    @Column(name = "institution_id")
    private long institutionId;

    @Column(name = "bank_account_number")
    private long bankAccountNumber;

    @Column(name = "transit_id")
    private long transitId;

    public Employee(Long employee_id, Set<Employee_type> roles, com.sait.ciaoToursEMS.model.login login, String firstName, String lastName, String address, String city, String emailAddress, Date employeeStartDate, Date employeeEndDate, float hourlyWage, float monthlySalary, String jobTitle, float sickDays, long institutionId, long bankAccountNumber, long transitId) {
        this.employee_id = employee_id;
        this.roles = roles;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.employeeStartDate = employeeStartDate;
        this.employeeEndDate = employeeEndDate;
        this.hourlyWage = hourlyWage;
        this.monthlySalary = monthlySalary;
        this.jobTitle = jobTitle;
        this.sickDays = sickDays;
        this.institutionId = institutionId;
        this.bankAccountNumber = bankAccountNumber;
        this.transitId = transitId;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Set<Employee_type> getRoles() {
        return roles;
    }

    public void setRoles(Set<Employee_type> roles) {
        this.roles = roles;
    }

    public com.sait.ciaoToursEMS.model.login getLogin() {
        return login;
    }

    public void setLogin(com.sait.ciaoToursEMS.model.login login) {
        this.login = login;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getSickDays() {
        return sickDays;
    }

    public void setSickDays(float sickDays) {
        this.sickDays = sickDays;
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
        return Float.compare(employee.getHourlyWage(), getHourlyWage()) == 0 && Float.compare(employee.getMonthlySalary(), getMonthlySalary()) == 0 && Float.compare(employee.getSickDays(), getSickDays()) == 0 && getInstitutionId() == employee.getInstitutionId() && getBankAccountNumber() == employee.getBankAccountNumber() && getTransitId() == employee.getTransitId() && Objects.equals(getEmployee_id(), employee.getEmployee_id()) && Objects.equals(getRoles(), employee.getRoles()) && Objects.equals(getLogin(), employee.getLogin()) && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getCity(), employee.getCity()) && Objects.equals(getEmailAddress(), employee.getEmailAddress()) && Objects.equals(getEmployeeStartDate(), employee.getEmployeeStartDate()) && Objects.equals(getEmployeeEndDate(), employee.getEmployeeEndDate()) && Objects.equals(getJobTitle(), employee.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee_id(), getRoles(), getLogin(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getEmployeeStartDate(), getEmployeeEndDate(), getHourlyWage(), getMonthlySalary(), getJobTitle(), getSickDays(), getInstitutionId(), getBankAccountNumber(), getTransitId());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", roles=" + roles +
                ", login=" + login +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", employeeStartDate=" + employeeStartDate +
                ", employeeEndDate=" + employeeEndDate +
                ", hourlyWage=" + hourlyWage +
                ", monthlySalary=" + monthlySalary +
                ", jobTitle='" + jobTitle + '\'' +
                ", sickDays=" + sickDays +
                ", institutionId=" + institutionId +
                ", bankAccountNumber=" + bankAccountNumber +
                ", transitId=" + transitId +
                '}';
    }
}
