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

    @Column(name = "employee_id")
    private long employeeId;

    @Column(name = "date_of_paystub")
    private Date dateOfPaystub;

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

    @Column(name = "monthly_salary")
    private float monthlySalary;

    @Column(name = "hourly_wage")
    private float hourlyWage;

    @Column(name = "time_off_hours")
    private double timeOffHours;

    @Column(name = "daily_assistance_number")
    private double dailyAssistanceNumber;

    @Column(name = "daily_assistance_charges")
    private double dailyAssistanceCharges;

    @Column(name = "tour_booking_hours")
    private double tourBookingHours;

    @Column(name = "tour_booking_charges")
    private double tourBookingCharges;

    @Column(name = "expense_amount")
    private float expenseAmount;

    @Column(name = "work_day_hours")
    private double workDayHours;

    @Column(name = "work_day_charges")
    private double workDayCharges;

    @Column(name = "stat_hours")
    private double statHours;

    @Column(name = "income_tax")
    private double incomeTax;

    @Column(name = "cpp_deductions")
    private double cppDeductions;

    @Column(name = "ei_deductions")
    private double eiDeductions;

    @Column(name = "gross_pay")
    private double grossPay;

    @Column(name = "net_pay")
    private double netPay;

    public Paystub() {
    }

    public Paystub(long paystubId, long employeeId, Date dateOfPaystub, String firstName, String lastName, String address, String city, String emailAddress, float monthlySalary, float hourlyWage, double timeOffHours, double dailyAssistanceNumber, double dailyAssistanceCharges, double tourBookingHours, double tourBookingCharges, float expenseAmount, double workDayHours, double workDayCharges, double statHours, double incomeTax, double cppDeductions, double eiDeductions, double grossPay, double netPay) {
        this.paystubId = paystubId;
        this.employeeId = employeeId;
        this.dateOfPaystub = dateOfPaystub;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.emailAddress = emailAddress;
        this.monthlySalary = monthlySalary;
        this.hourlyWage = hourlyWage;
        this.timeOffHours = timeOffHours;
        this.dailyAssistanceNumber = dailyAssistanceNumber;
        this.dailyAssistanceCharges = dailyAssistanceCharges;
        this.tourBookingHours = tourBookingHours;
        this.tourBookingCharges = tourBookingCharges;
        this.expenseAmount = expenseAmount;
        this.workDayHours = workDayHours;
        this.workDayCharges = workDayCharges;
        this.statHours = statHours;
        this.incomeTax = incomeTax;
        this.cppDeductions = cppDeductions;
        this.eiDeductions = eiDeductions;
        this.grossPay = grossPay;
        this.netPay = netPay;
    }

    public long getPaystubId() {
        return paystubId;
    }

    public void setPaystubId(long paystubId) {
        this.paystubId = paystubId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDateOfPaystub() {
        return dateOfPaystub;
    }

    public void setDateOfPaystub(Date dateOfPaystub) {
        this.dateOfPaystub = dateOfPaystub;
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

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public float getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(float hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getTimeOffHours() {
        return timeOffHours;
    }

    public void setTimeOffHours(double timeOffHours) {
        this.timeOffHours = timeOffHours;
    }

    public double getDailyAssistanceNumber() {
        return dailyAssistanceNumber;
    }

    public void setDailyAssistanceNumber(double dailyAssistanceNumber) {
        this.dailyAssistanceNumber = dailyAssistanceNumber;
    }

    public double getDailyAssistanceCharges() {
        return dailyAssistanceCharges;
    }

    public void setDailyAssistanceCharges(double dailyAssistanceCharges) {
        this.dailyAssistanceCharges = dailyAssistanceCharges;
    }

    public double getTourBookingHours() {
        return tourBookingHours;
    }

    public void setTourBookingHours(double tourBookingHours) {
        this.tourBookingHours = tourBookingHours;
    }

    public double getTourBookingCharges() {
        return tourBookingCharges;
    }

    public void setTourBookingCharges(double tourBookingCharges) {
        this.tourBookingCharges = tourBookingCharges;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public double getWorkDayHours() {
        return workDayHours;
    }

    public void setWorkDayHours(double workDayHours) {
        this.workDayHours = workDayHours;
    }

    public double getWorkDayCharges() {
        return workDayCharges;
    }

    public void setWorkDayCharges(double workDayCharges) {
        this.workDayCharges = workDayCharges;
    }

    public double getStatHours() {
        return statHours;
    }

    public void setStatHours(double statHours) {
        this.statHours = statHours;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getCppDeductions() {
        return cppDeductions;
    }

    public void setCppDeductions(double cppDeductions) {
        this.cppDeductions = cppDeductions;
    }

    public double getEiDeductions() {
        return eiDeductions;
    }

    public void setEiDeductions(double eiDeductions) {
        this.eiDeductions = eiDeductions;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paystub)) return false;
        Paystub paystub = (Paystub) o;
        return paystubId == paystub.paystubId &&
                employeeId == paystub.employeeId &&
                Float.compare(paystub.monthlySalary, monthlySalary) == 0 &&
                Float.compare(paystub.hourlyWage, hourlyWage) == 0 &&
                Double.compare(paystub.timeOffHours, timeOffHours) == 0 &&
                Double.compare(paystub.dailyAssistanceNumber, dailyAssistanceNumber) == 0 &&
                Double.compare(paystub.dailyAssistanceCharges, dailyAssistanceCharges) == 0 &&
                Double.compare(paystub.tourBookingHours, tourBookingHours) == 0 &&
                Double.compare(paystub.tourBookingCharges, tourBookingCharges) == 0 &&
                Float.compare(paystub.expenseAmount, expenseAmount) == 0 &&
                Double.compare(paystub.workDayHours, workDayHours) == 0 &&
                Double.compare(paystub.workDayCharges, workDayCharges) == 0 &&
                Double.compare(paystub.statHours, statHours) == 0 &&
                Double.compare(paystub.incomeTax, incomeTax) == 0 &&
                Double.compare(paystub.cppDeductions, cppDeductions) == 0 &&
                Double.compare(paystub.eiDeductions, eiDeductions) == 0 &&
                Double.compare(paystub.grossPay, grossPay) == 0 &&
                Double.compare(paystub.netPay, netPay) == 0 &&
                Objects.equals(dateOfPaystub, paystub.dateOfPaystub) &&
                Objects.equals(firstName, paystub.firstName) &&
                Objects.equals(lastName, paystub.lastName) &&
                Objects.equals(address, paystub.address) &&
                Objects.equals(city, paystub.city) &&
                Objects.equals(emailAddress, paystub.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paystubId, employeeId, dateOfPaystub, firstName, lastName, address, city, emailAddress, monthlySalary, hourlyWage, timeOffHours, dailyAssistanceNumber, dailyAssistanceCharges, tourBookingHours, tourBookingCharges, expenseAmount, workDayHours, workDayCharges, statHours, incomeTax, cppDeductions, eiDeductions, grossPay, netPay);
    }

    @Override
    public String toString() {
        return "Paystub{" +
                "paystubId=" + paystubId +
                ", employeeId=" + employeeId +
                ", dateOfPaystub=" + dateOfPaystub +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", hourlyWage=" + hourlyWage +
                ", timeOffHours=" + timeOffHours +
                ", dailyAssistanceNumber=" + dailyAssistanceNumber +
                ", dailyAssistanceCharges=" + dailyAssistanceCharges +
                ", tourBookingHours=" + tourBookingHours +
                ", tourBookingCharges=" + tourBookingCharges +
                ", expenseAmount=" + expenseAmount +
                ", workDayHours=" + workDayHours +
                ", workDayCharges=" + workDayCharges +
                ", statHours=" + statHours +
                ", incomeTax=" + incomeTax +
                ", cppDeductions=" + cppDeductions +
                ", eiDeductions=" + eiDeductions +
                ", grossPay=" + grossPay +
                ", netPay=" + netPay +
                '}';
    }
}

