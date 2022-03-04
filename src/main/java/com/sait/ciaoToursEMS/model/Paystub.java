package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "paystubs")
public class Paystub {
    @Id
    @GeneratedValue
    @Column(name = "paystub_id")
    private long paystubId;

    @Column(name = "first_name")
    private  String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "email_address")
    private  String emailAddress;

    @Column(name = "description")
    private String description;

    @Column(name = "hourly_wage")
    private float hourlyWage;

    @Column(name = "number_of_workdays")
    private int numberOfWorkdays;

    @Column(name = "number_of_days_off")
    private int numberOfDaysOff;

    @Column(name = "non_salary_income")
    private float  nonSalaryIncome;

    @Column(name = "expense_amount")
    private float expenseAmount;

    @Column(name = "number_of_hours")
    private int numberOfHours;

    @Column(name = "monthly_salary")
    private float monthlySalary;

    @Column(name = "rate")
    private float rate;

    @Column(name = "date_of_paystub")
    private Date dateOfPaystub;

    public Paystub(){}

    public Paystub(long paystubId, String firstName, String lastName, String address, String city,
                   String emailAddress, String description, float hourlyWage, int numberOfWorkdays,
                   int numberOfDaysOff, float nonSalaryIncome, float expenseAmount, int numberOfHours,
                   float monthlySalary, float rate, Date dateOfPaystub) {
        this.paystubId = paystubId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.description = description;
        this.hourlyWage = hourlyWage;
        this.numberOfWorkdays = numberOfWorkdays;
        this.numberOfDaysOff = numberOfDaysOff;
        this.nonSalaryIncome = nonSalaryIncome;
        this.expenseAmount = expenseAmount;
        this.numberOfHours = numberOfHours;
        this.monthlySalary = monthlySalary;
        this.rate = rate;
        this.dateOfPaystub = dateOfPaystub;
    }

    public long getPaystubId() {
        return paystubId;
    }

    public void setPaystubId(long paystubId) {
        this.paystubId = paystubId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public int getNumberOfDaysOff() {
        return numberOfDaysOff;
    }

    public void setNumberOfDaysOff(int numberOfDaysOff) {
        this.numberOfDaysOff = numberOfDaysOff;
    }

    public float getNonSalaryIncome() {
        return nonSalaryIncome;
    }

    public void setNonSalaryIncome(float nonSalaryIncome) {
        this.nonSalaryIncome = nonSalaryIncome;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Date getDateOfPaystub() {
        return dateOfPaystub;
    }

    public void setDateOfPaystub(Date dateOfPaystub) {
        this.dateOfPaystub = dateOfPaystub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paystub)) return false;
        Paystub paystub = (Paystub) o;
        return getPaystubId() == paystub.getPaystubId() && Float.compare(paystub.getHourlyWage(), getHourlyWage()) == 0 && getNumberOfWorkdays() == paystub.getNumberOfWorkdays() && getNumberOfDaysOff() == paystub.getNumberOfDaysOff() && Float.compare(paystub.getNonSalaryIncome(), getNonSalaryIncome()) == 0 && Float.compare(paystub.getExpenseAmount(), getExpenseAmount()) == 0 && getNumberOfHours() == paystub.getNumberOfHours() && Float.compare(paystub.getMonthlySalary(), getMonthlySalary()) == 0 && Float.compare(paystub.getRate(), getRate()) == 0 && Objects.equals(getFirstName(), paystub.getFirstName()) && Objects.equals(getLastName(), paystub.getLastName()) && Objects.equals(getAddress(), paystub.getAddress()) && Objects.equals(getCity(), paystub.getCity()) && Objects.equals(getEmailAddress(), paystub.getEmailAddress()) && Objects.equals(getDescription(), paystub.getDescription()) && Objects.equals(getDateOfPaystub(), paystub.getDateOfPaystub());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaystubId(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getDescription(), getHourlyWage(), getNumberOfWorkdays(), getNumberOfDaysOff(), getNonSalaryIncome(), getExpenseAmount(), getNumberOfHours(), getMonthlySalary(), getRate(), getDateOfPaystub());
    }

    @Override
    public String toString() {
        return "paystub{" +
                "paystubId=" + paystubId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", description='" + description + '\'' +
                ", hourlyWage=" + hourlyWage +
                ", numberOfWorkdays=" + numberOfWorkdays +
                ", numberOfDaysOff=" + numberOfDaysOff +
                ", nonSalaryIncome=" + nonSalaryIncome +
                ", expenseAmount=" + expenseAmount +
                ", numberOfHours=" + numberOfHours +
                ", monthlySalary=" + monthlySalary +
                ", rate=" + rate +
                ", dateOfPaystub=" + dateOfPaystub +
                '}';
    }
}
