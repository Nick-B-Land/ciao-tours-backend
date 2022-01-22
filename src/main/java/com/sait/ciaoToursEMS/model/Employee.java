package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id" )
    private long employee_id ;
    @ManyToOne
    @JoinColumn(name = "employee_type_id", table = "Employee_type")
    @Column(name = "employee_type_id")
    private long employee_type_id ;
    @Column(name = "firstName")
    private String firstName ;
    @Column(name = "lastName")
    private String lastName ;
    @Column(name = "address")
    private String address ;
    @Column(name = "city")
    private String city ;
    @Column(name = "emailAddress")
    private  String emailAddress ;
    @Column(name = "employee_start_date")
    private Date employee_start_date ;
    @Column(name = "employee_end_date")
    private  Date employee_end_date ;
    @Column(name = "hourlyWage")
    private float hourlyWage;
    @Column(name = "isAdmin")
    private boolean isAdmin;
    @Column(name = "isBookeeper")
    private  boolean isBookeeper;
    @Column(name = "institution_id")
    private long institution_id;
    @Column(name = "bankAccount_number")
    private long bankAccount_number;
    @Column(name = "transit_id")
    private long transit_id;

    public Employee(long employee_id, long employee_type_id, String firstName, String lastName, String address, String city, String emailAddress, Date employee_start_date, Date employee_end_date, float hourlyWage, boolean isAdmin, boolean isBookeeper, long institution_id, long bankAccount_number, long transit_id) {
        this.employee_id = employee_id;
        this.employee_type_id = employee_type_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.employee_start_date = employee_start_date;
        this.employee_end_date = employee_end_date;
        this.hourlyWage = hourlyWage;
        this.isAdmin = isAdmin;
        this.isBookeeper = isBookeeper;
        this.institution_id = institution_id;
        this.bankAccount_number = bankAccount_number;
        this.transit_id = transit_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getEmployee_type_id() {
        return employee_type_id;
    }

    public void setEmployee_type_id(long employee_type_id) {
        this.employee_type_id = employee_type_id;
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

    public Date getEmployee_start_date() {
        return employee_start_date;
    }

    public void setEmployee_start_date(Date employee_start_date) {
        this.employee_start_date = employee_start_date;
    }

    public Date getEmployee_end_date() {
        return employee_end_date;
    }

    public void setEmployee_end_date(Date employee_end_date) {
        this.employee_end_date = employee_end_date;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isBookeeper() {
        return isBookeeper;
    }

    public void setBookeeper(boolean bookeeper) {
        isBookeeper = bookeeper;
    }

    public long getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(long institution_id) {
        this.institution_id = institution_id;
    }

    public long getBankAccount_number() {
        return bankAccount_number;
    }

    public void setBankAccount_number(long bankAccount_number) {
        this.bankAccount_number = bankAccount_number;
    }

    public long getTransit_id() {
        return transit_id;
    }

    public void setTransit_id(long transit_id) {
        this.transit_id = transit_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployee_id() == employee.getEmployee_id() && getEmployee_type_id() == employee.getEmployee_type_id() && Float.compare(employee.getHourlyWage(), getHourlyWage()) == 0 && isAdmin() == employee.isAdmin() && isBookeeper() == employee.isBookeeper() && getInstitution_id() == employee.getInstitution_id() && getBankAccount_number() == employee.getBankAccount_number() && getTransit_id() == employee.getTransit_id() && getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName()) && getAddress().equals(employee.getAddress()) && getCity().equals(employee.getCity()) && getEmailAddress().equals(employee.getEmailAddress()) && getEmployee_start_date().equals(employee.getEmployee_start_date()) && getEmployee_end_date().equals(employee.getEmployee_end_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee_id(), getEmployee_type_id(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getEmployee_start_date(), getEmployee_end_date(), getHourlyWage(), isAdmin(), isBookeeper(), getInstitution_id(), getBankAccount_number(), getTransit_id());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_type_id=" + employee_type_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", employee_start_date=" + employee_start_date +
                ", employee_end_date=" + employee_end_date +
                ", hourlyWage=" + hourlyWage +
                ", isAdmin=" + isAdmin +
                ", isBookeeper=" + isBookeeper +
                ", institution_id=" + institution_id +
                ", bankAccount_number=" + bankAccount_number +
                ", transit_id=" + transit_id +
                '}';
    }
}
