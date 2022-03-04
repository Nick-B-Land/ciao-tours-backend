package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "payroll_data")
public class PayrollData {


    @Id
    @GeneratedValue
    @Column(name = "payroll_data_id")
    private long payrollDataId;

    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "payroll_id")
    @Column(name = "payroll_id")
    private long payrollId;

    @Column(name = "payroll_event")
    private int payrollEvent;

    @Column(name = "date_of_payroll_data")
    private  Date dateOfPayrollData;

    @Column(name = "no_of_working_hours")
    private int noOfWorkingHours;

    @Column(name = "time_off")
    private  double timeOff;

    @Column(name = "office_usage")
    private  String officeUsage;

    @Column(name = "other_usage")
    private  String otherUsage;

    @Column(name = "usage_cost")
    private float usageCost;

    @Column(name = "daily_assistance_client")
    private  String dailyAssistanceClient;

    @Column(name = "daily_assistance_start_date")
    private LocalDateTime dailyAssistanceStartDate;

    @Column(name = "daily_assistance_end_date")
    private LocalDateTime  dailyAssistanceEndDate;

    @Column(name = "daily_assistance_fee")
    private float dailyAssistanceFee ;

    @Column(name = "tour_booking_admin_description")
    private String tourBookingAdminDescription;

    @Column(name = "tour_booking_num_of_hours")
    private int tourBookingNumOfHours;

    @Column(name = "tour_booking_client")
    private String tourBookingClient;

    @Column(name = "tour_booking_admin_fee")
    private float tourBookingAdminFee ;

    @Column(name = "day_of_expense")
    private Date dayOfExpense ;

    @Column(name = "expense_description")
    private String expenseDescription ;

    @Column(name = "expense_amount")
    private float expenseAmount;

    @Column(name = "expense_date")
    private Date expenseDate;

    public PayrollData(){}

    public PayrollData(long payrollDataId, long payrollId, int payrollEvent, Date dateOfPayrollData, int noOfWorkingHours,
                       double timeOff, String officeUsage, String otherUsage, float usageCost, String dailyAssistanceClient, LocalDateTime dailyAssistanceStartDate,
                       LocalDateTime dailyAssistanceEndDate, float dailyAssistanceFee, String tourBookingAdminDescription, int tourBookingNumOfHours, String tourBookingClient,
                       float tourBookingAdminFee, Date dayOfExpense, String expenseDescription, float expenseAmount, Date expenseDate){
        this.payrollDataId = payrollDataId;
        this.payrollId = payrollId;
        this.payrollEvent = payrollEvent;
        this.dateOfPayrollData = dateOfPayrollData;
        this.noOfWorkingHours = noOfWorkingHours;
        this.timeOff = timeOff;
        this.officeUsage = officeUsage;
        this.otherUsage = otherUsage;
        this.usageCost = usageCost;
        this.dailyAssistanceClient = dailyAssistanceClient;
        this.dailyAssistanceStartDate = dailyAssistanceStartDate;
        this.dailyAssistanceEndDate = dailyAssistanceEndDate;
        this.dailyAssistanceFee = dailyAssistanceFee;
        this.tourBookingAdminDescription = tourBookingAdminDescription;
        this.tourBookingNumOfHours = tourBookingNumOfHours;
        this.tourBookingClient = tourBookingClient;
        this.tourBookingAdminFee = tourBookingAdminFee;
        this.dayOfExpense = dayOfExpense;
        this.expenseDescription = expenseDescription;
        this.expenseAmount = expenseAmount;
        this.expenseDate = expenseDate;
    }

    public long getPayrollDataId() {
        return payrollDataId;
    }

    public void setPayrollDataId(long payrollDataId) {
        this.payrollDataId = payrollDataId;
    }

    public long getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(long payrollId) {
        this.payrollId = payrollId;
    }

    public int getPayrollEvent() {
        return payrollEvent;
    }

    public void setPayrollEvent(int payrollEvent) {
        this.payrollEvent = payrollEvent;
    }

    public Date getDateOfPayrollData() {
        return dateOfPayrollData;
    }

    public void setDateOfPayrollData(Date dateOfPayrollData) {
        this.dateOfPayrollData = dateOfPayrollData;
    }

    public int getNoOfWorkingHours() {
        return noOfWorkingHours;
    }

    public void setNoOfWorkingHours(int noOfWorkingHours) {
        this.noOfWorkingHours = noOfWorkingHours;
    }

    public double getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(double timeOff) {
        this.timeOff = timeOff;
    }

    public String getOfficeUsage() {
        return officeUsage;
    }

    public void setOfficeUsage(String officeUsage) {
        this.officeUsage = officeUsage;
    }

    public String getOtherUsage() {
        return otherUsage;
    }

    public void setOtherUsage(String otherUsage) {
        this.otherUsage = otherUsage;
    }

    public float getUsageCost() {
        return usageCost;
    }

    public void setUsageCost(float usageCost) {
        this.usageCost = usageCost;
    }

    public String getDailyAssistanceClient() {
        return dailyAssistanceClient;
    }

    public void setDailyAssistanceClient(String dailyAssistanceClient) {
        this.dailyAssistanceClient = dailyAssistanceClient;
    }

    public LocalDateTime getDailyAssistanceStartDate() {
        return dailyAssistanceStartDate;
    }

    public void setDailyAssistanceStartDate(LocalDateTime dailyAssistanceStartDate) {
        this.dailyAssistanceStartDate = dailyAssistanceStartDate;
    }

    public LocalDateTime getDailyAssistanceEndDate() {
        return dailyAssistanceEndDate;
    }

    public void setDailyAssistanceEndDate(LocalDateTime dailyAssistanceEndDate) {
        this.dailyAssistanceEndDate = dailyAssistanceEndDate;
    }

    public float getDailyAssistanceFee() {
        return dailyAssistanceFee;
    }

    public void setDailyAssistanceFee(float dailyAssistanceFee) {
        this.dailyAssistanceFee = dailyAssistanceFee;
    }

    public String getTourBookingAdminDescription() {
        return tourBookingAdminDescription;
    }

    public void setTourBookingAdminDescription(String tourBookingAdminDescription) {
        this.tourBookingAdminDescription = tourBookingAdminDescription;
    }

    public int getTourBookingNumOfHours() {
        return tourBookingNumOfHours;
    }

    public void setTourBookingNumOfHours(int tourBookingNumOfHours) {
        this.tourBookingNumOfHours = tourBookingNumOfHours;
    }

    public String getTourBookingClient() {
        return tourBookingClient;
    }

    public void setTourBookingClient(String tourBookingClient) {
        this.tourBookingClient = tourBookingClient;
    }

    public float getTourBookingAdminFee() {
        return tourBookingAdminFee;
    }

    public void setTourBookingAdminFee(float tourBookingAdminFee) {
        this.tourBookingAdminFee = tourBookingAdminFee;
    }

    public Date getDayOfExpense() {
        return dayOfExpense;
    }

    public void setDayOfExpense(Date dayOfExpense) {
        this.dayOfExpense = dayOfExpense;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PayrollData)) return false;
        PayrollData that = (PayrollData) o;
        return getPayrollDataId() == that.getPayrollDataId() && getNoOfWorkingHours() == that.getNoOfWorkingHours() && Double.compare(that.getTimeOff(), getTimeOff()) == 0 && Float.compare(that.getUsageCost(), getUsageCost()) == 0 && Float.compare(that.getDailyAssistanceFee(), getDailyAssistanceFee()) == 0 && getTourBookingNumOfHours() == that.getTourBookingNumOfHours() && Float.compare(that.getTourBookingAdminFee(), getTourBookingAdminFee()) == 0 && Float.compare(that.getExpenseAmount(), getExpenseAmount()) == 0 && Objects.equals(getPayrollId(), that.getPayrollId()) && Objects.equals(getPayrollEvent(), that.getPayrollEvent()) && Objects.equals(getDateOfPayrollData(), that.getDateOfPayrollData()) && Objects.equals(getOfficeUsage(), that.getOfficeUsage()) && Objects.equals(getOtherUsage(), that.getOtherUsage()) && Objects.equals(getDailyAssistanceClient(), that.getDailyAssistanceClient()) && Objects.equals(getDailyAssistanceStartDate(), that.getDailyAssistanceStartDate()) && Objects.equals(getDailyAssistanceEndDate(), that.getDailyAssistanceEndDate()) && Objects.equals(getTourBookingAdminDescription(), that.getTourBookingAdminDescription()) && Objects.equals(getTourBookingClient(), that.getTourBookingClient()) && Objects.equals(getDayOfExpense(), that.getDayOfExpense()) && Objects.equals(getExpenseDescription(), that.getExpenseDescription()) && Objects.equals(getExpenseDate(), that.getExpenseDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPayrollDataId(), getPayrollId(), getPayrollEvent(), getDateOfPayrollData(), getNoOfWorkingHours(), getTimeOff(), getOfficeUsage(), getOtherUsage(), getUsageCost(), getDailyAssistanceClient(), getDailyAssistanceStartDate(), getDailyAssistanceEndDate(), getDailyAssistanceFee(), getTourBookingAdminDescription(), getTourBookingNumOfHours(), getTourBookingClient(), getTourBookingAdminFee(), getDayOfExpense(), getExpenseDescription(), getExpenseAmount(), getExpenseDate());
    }

    @Override
    public String toString() {
        return "payroll_data{" +
                "PayrollDataId=" + payrollDataId +
                ", payroll=" + payrollId +
                ", payrollEvent=" + payrollEvent +
                ", dateOfPayrollData=" + dateOfPayrollData +
                ", noOfWorkingHours=" + noOfWorkingHours +
                ", timeOff=" + timeOff +
                ", officeUsage='" + officeUsage + '\'' +
                ", otherUsage='" + otherUsage + '\'' +
                ", usageCost=" + usageCost +
                ", dailyAssistanceClient='" + dailyAssistanceClient + '\'' +
                ", dailyAssistanceStartDate=" + dailyAssistanceStartDate +
                ", dailyAssistanceEndDate=" + dailyAssistanceEndDate +
                ", dailyAssistanceFee=" + dailyAssistanceFee +
                ", tourBookingAdminDescription='" + tourBookingAdminDescription + '\'' +
                ", tourBookingNumOfHours=" + tourBookingNumOfHours +
                ", tourBookingClient='" + tourBookingClient + '\'' +
                ", tourBookingAdminFee=" + tourBookingAdminFee +
                ", dayOfExpense=" + dayOfExpense +
                ", expenseDescription='" + expenseDescription + '\'' +
                ", expenseAmount=" + expenseAmount +
                ", expenseDate=" + expenseDate +
                '}';
    }
}

