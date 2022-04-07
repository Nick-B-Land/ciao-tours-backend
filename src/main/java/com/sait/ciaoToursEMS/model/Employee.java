package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.*;



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

    @OneToMany(mappedBy = "employee", orphanRemoval = true)
    private Set<Payroll> payrolls = new LinkedHashSet<>();

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("paystubs.date_of_paystub DESC")
    private List<Paystub> paystubs = new ArrayList<>();

    public List<Paystub> getPaystubs() {
        return paystubs;
    }

    public void setPaystubs(List<Paystub> paystubs) {
        this.paystubs = paystubs;
    }

    public void setPayrolls(Set<Payroll> payrolls) {
        this.payrolls = payrolls;
    }

    public Set<Payroll> getPayrolls() {
        return payrolls;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Employee(){}

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

    public long getEmployeeId() {
        return employeeId;
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

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

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
