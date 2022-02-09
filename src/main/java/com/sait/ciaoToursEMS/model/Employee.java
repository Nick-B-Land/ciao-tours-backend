package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id" )
    private long employee_id ;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "employee_type_id", referencedColumnName = "employee_type_id")
    private Employee_type employee_type;
    @Column(name = "firstName")
   String firstName;
    @Column(name = "lastName")
   String lastName;
    @Column(name = "address")
   String address;
    @Column(name = "city")
   String city;
    @Column(name = "emailAddress")
   String emailAddress;
    @Column(name = "employee_start_date")
   LocalDateTime employee_start_date;
    @Column(name = "employee_end_date")
   LocalDateTime employee_end_date;
    @Column(name = "hourlyWage")
   float hourlyWage;
    @Column(name = "isAdmin")
   int isAdmin;
    @Column(name = "isBookeeper")
   int isBookeeper;
    @Column(name = "institution_id")
    int institution_id;
    @Column(name = "bankAccount_number")
    int bankAccount_number;
    @Column(name = "transit_id")
    int transit_id;

    public Employee(long employee_id, String firstName, String lastName, String address, String city, String emailAddress, LocalDateTime employee_start_date, LocalDateTime employee_end_date, float hourlyWage, int isAdmin, int isBookeeper, int institution_id, int bankAccount_number, int transit_id) {
        this.employee_id = employee_id;
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

    public LocalDateTime getEmployee_start_date() {
        return employee_start_date;
    }

    public void setEmployee_start_date(LocalDateTime employee_start_date) {
        this.employee_start_date = employee_start_date;
    }

    public LocalDateTime getEmployee_end_date() {
        return employee_end_date;
    }

    public void setEmployee_end_date(LocalDateTime employee_end_date) {
        this.employee_end_date = employee_end_date;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsBookeeper() {
        return isBookeeper;
    }

    public void setIsBookeeper(int isBookeeper) {
        this.isBookeeper = isBookeeper;
    }

    public int getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(int institution_id) {
        this.institution_id = institution_id;
    }

    public int getBankAccount_number() {
        return bankAccount_number;
    }

    public void setBankAccount_number(int bankAccount_number) {
        this.bankAccount_number = bankAccount_number;
    }

    public int getTransit_id() {
        return transit_id;
    }

    public void setTransit_id(int transit_id) {
        this.transit_id = transit_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmployee_id() == employee.getEmployee_id() && Float.compare(employee.getHourlyWage(), getHourlyWage()) == 0 && getIsAdmin() == employee.getIsAdmin() && getIsBookeeper() == employee.getIsBookeeper() && getInstitution_id() == employee.getInstitution_id() && getBankAccount_number() == employee.getBankAccount_number() && getTransit_id() == employee.getTransit_id() && getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName()) && getAddress().equals(employee.getAddress()) && getCity().equals(employee.getCity()) && getEmailAddress().equals(employee.getEmailAddress()) && getEmployee_start_date().equals(employee.getEmployee_start_date()) && getEmployee_end_date().equals(employee.getEmployee_end_date());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployee_id(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getEmployee_start_date(), getEmployee_end_date(), getHourlyWage(), getIsAdmin(), getIsBookeeper(), getInstitution_id(), getBankAccount_number(), getTransit_id());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
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
