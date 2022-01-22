package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "paystubs")
public class paystub {
    @Id
    @GeneratedValue
    @Column(name = "paystub_id")
    private long paystub_id;
    @Column(name = "firstName")
    private  String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "emailAddress")
    private  String emailAddress;
    @Column(name = "description")
    private String description;
    @Column(name = "hourlyWage")
    private float hourlyWage;
    @Column(name = "number_of_workdays")
    private int number_of_workdays;
    @Column(name = "number_of_days_off")
    private int number_of_days_off;
    @Column(name = "non_salary_income")
    private float  non_salary_income;
    @Column(name = "expenseAmount")
    private float expenseAmount;
    @Column(name = "numberOfHours")
    private int numberOfHours;
    @Column(name = "monthly_salary")
    private float monthly_salary;
    @Column(name = "rate")
    private float rate;
    @Column(name = "date_of_paystub")
    private Date date_of_paystub;

    public paystub(long paystub_id, String firstName, String lastName, String address, String city,
                   String emailAddress, String description, float hourlyWage, int number_of_workdays,
                   int number_of_days_off, float non_salary_income, float expenseAmount, int numberOfHours,
                   float monthly_salary, float rate, Date date_of_paystub)
    {
        this.paystub_id = paystub_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.description = description;
        this.hourlyWage = hourlyWage;
        this.number_of_workdays = number_of_workdays;
        this.number_of_days_off = number_of_days_off;
        this.non_salary_income = non_salary_income;
        this.expenseAmount = expenseAmount;
        this.numberOfHours = numberOfHours;
        this.monthly_salary = monthly_salary;
        this.rate = rate;
        this.date_of_paystub = date_of_paystub;
    }

    public long getPaystub_id() {
        return paystub_id;
    }

    public void setPaystub_id(long paystub_id) {
        this.paystub_id = paystub_id;
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

    public int getNumber_of_workdays() {
        return number_of_workdays;
    }

    public void setNumber_of_workdays(int number_of_workdays) {
        this.number_of_workdays = number_of_workdays;
    }

    public int getNumber_of_days_off() {
        return number_of_days_off;
    }

    public void setNumber_of_days_off(int number_of_days_off) {
        this.number_of_days_off = number_of_days_off;
    }

    public float getNon_salary_income() {
        return non_salary_income;
    }

    public void setNon_salary_income(float non_salary_income) {
        this.non_salary_income = non_salary_income;
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

    public float getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(float monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Date getDate_of_paystub() {
        return date_of_paystub;
    }

    public void setDate_of_paystub(Date date_of_paystub) {
        this.date_of_paystub = date_of_paystub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof paystub)) return false;
        paystub paystub = (paystub) o;
        return getPaystub_id() == paystub.getPaystub_id() && Float.compare(paystub.getHourlyWage(), getHourlyWage()) == 0 &&
                getNumber_of_workdays() == paystub.getNumber_of_workdays() && getNumber_of_days_off() ==
                paystub.getNumber_of_days_off() && Float.compare(paystub.getNon_salary_income(), getNon_salary_income()) ==
                0 && Float.compare(paystub.getExpenseAmount(), getExpenseAmount()) == 0 && getNumberOfHours() ==
                paystub.getNumberOfHours() && Float.compare(paystub.getMonthly_salary(), getMonthly_salary()) == 0 &&
                Float.compare(paystub.getRate(), getRate()) == 0 && getFirstName().equals(paystub.getFirstName()) &&
                getLastName().equals(paystub.getLastName()) && getAddress().equals(paystub.getAddress()) &&
                getCity().equals(paystub.getCity()) && getEmailAddress().equals(paystub.getEmailAddress()) &&
                getDescription().equals(paystub.getDescription()) && getDate_of_paystub().equals(paystub.getDate_of_paystub());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPaystub_id(), getFirstName(), getLastName(), getAddress(), getCity(), getEmailAddress(), getDescription(), getHourlyWage(), getNumber_of_workdays(), getNumber_of_days_off(), getNon_salary_income(), getExpenseAmount(), getNumberOfHours(), getMonthly_salary(), getRate(), getDate_of_paystub());
    }

    @Override
    public String toString() {
        return "paystub{" +
                "paystub_id=" + paystub_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", description='" + description + '\'' +
                ", hourlyWage=" + hourlyWage +
                ", number_of_workdays=" + number_of_workdays +
                ", number_of_days_off=" + number_of_days_off +
                ", non_salary_income=" + non_salary_income +
                ", expenseAmount=" + expenseAmount +
                ", numberOfHours=" + numberOfHours +
                ", monthly_salary=" + monthly_salary +
                ", rate=" + rate +
                ", date_of_paystub=" + date_of_paystub +
                '}';
    }
}
