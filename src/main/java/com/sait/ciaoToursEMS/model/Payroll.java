package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * Payroll Entity
 * Each payroll has a date, Id, and associated employee.
 */
@Entity
@Table(name = "payroll")
public class Payroll {

    /**
     * Payroll Id (primary key)
     * Payroll Id is auto-generated
     */
    @Id
    @GeneratedValue
    @Column(name = "payroll_id")
    private long payrollId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employee_id")
    /**
     * Employee id associated with this payroll object
     */
    @Column(name = "employee_id")
    private long employeeId;

    /**
     * Payroll date
     */
    @Column(name = "date_of_payroll")
    private Date dateOfPayroll;

    /**
     * Is payroll processed 1 = yes, 0 = no
     */
    @Column(name = "is_processed")
    private int isProcessed;

    /**
     * is payroll flagged for review 1 = yes, 0 = no
     */
    @Column(name = "is_flagged")
    private int isFlagged;

    /**
     * Default constructor
     */
    public Payroll(){}

    /**
     * Payroll constructor
     * @param payrollId Payroll Id
     * @param employeeId Employee Id
     * @param dateOfPayroll Payroll date
     * @param isProcessed Is payroll processed 1 = yes, 0 = no
     * @param isFlagged Is payroll flagged for review 1 = yes, 0 = no
     */
    public Payroll(long payrollId, long employeeId, Date dateOfPayroll, int isProcessed, int isFlagged) {
        this.payrollId = payrollId;
        this.employeeId = employeeId;
        this.dateOfPayroll = dateOfPayroll;
        this.isProcessed = isProcessed;
        this.isFlagged = isFlagged;
    }

    /**
     * Get employee Id associated with this payroll object
     * @return Payroll Id
     */
    public long getEmployeeId() {
        return employeeId;
    }

    /**
     * Set employee Id associated with this payroll object
     * @param employeeId Employee Id
     */
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Get payroll Id
     * @return Payroll Id
     */
    public long getPayrollId() {
        return payrollId;
    }

    /**
     * Set payroll Id
     * @param payrollId Payroll Id
     */
    public void setPayrollId(long payrollId) {
        this.payrollId = payrollId;
    }

    /**
     * Get payroll date
     * @return Payroll date
     */
    public Date getDateOfPayroll() {
        return dateOfPayroll;
    }

    /**
     * Set payroll date
     * @param dateOfPayroll Payroll date
     */
    public void setDateOfPayroll(Date dateOfPayroll) {
        this.dateOfPayroll = dateOfPayroll;
    }

    /**
     * Get is payroll processed 1 = yes, 0 = no
     * @return Is payroll processed 1 = yes, 0 = no
     */
    public int getIsProcessed() {
        return isProcessed;
    }

    /**
     * Set is payroll processed 1 = yes, 0 = no
     * @param isProcessed Is payroll processed 1 = yes, 0 = no
     */
    public void setIsProcessed(int isProcessed) {
        this.isProcessed = isProcessed;
    }

    /**
     * Get is payroll flagged for review 1 = yes, 0 = no
     * @return Is payroll flagged for review 1 = yes, 0 = no
     */
    public int getIsFlagged() {
        return isFlagged;
    }

    /**
     * Set is payroll flagged for review 1 = yes, 0 = no
     * @param isFlagged Is payroll flagged for review 1 = yes, 0 = no
     */
    public void setIsFlagged(int isFlagged) {
        this.isFlagged = isFlagged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payroll)) return false;
        Payroll payroll = (Payroll) o;
        return payrollId == payroll.payrollId &&
                employeeId == payroll.employeeId &&
                isProcessed == payroll.isProcessed &&
                isFlagged == payroll.isFlagged &&
                Objects.equals(dateOfPayroll, payroll.dateOfPayroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payrollId, employeeId, dateOfPayroll, isProcessed, isFlagged);
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", employeeId=" + employeeId +
                ", dateOfPayroll=" + dateOfPayroll +
                ", isProcessed=" + isProcessed +
                ", isFlagged=" + isFlagged +
                '}';
    }
}
