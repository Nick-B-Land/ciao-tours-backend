package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "payroll")
public class Payroll {

    @Id
    @GeneratedValue
    @Column(name = "payroll_id")
    private long payrollId;

    @Column(name = "date_of_payroll")
    private Date dateOfPayroll;

    @Column(name = "is_processed")
    private int isProcessed;

    @Column(name = "is_flagged")
    private int isFlagged;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    public Payroll(){}

    public Payroll(long payrollId, long employeeId, Date dateOfPayroll, int isProcessed, int isFlagged) {
        this.payrollId = payrollId;
        this.dateOfPayroll = dateOfPayroll;
        this.isProcessed = isProcessed;
        this.isFlagged = isFlagged;
    }

    public Employee getEmployee() {
        return employee;
    }



    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getEmployeeID() {
        return this.employee.getEmployeeId();
    }

    public long getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(long payrollId) {
        this.payrollId = payrollId;
    }

    public Date getDateOfPayroll() {
        return dateOfPayroll;
    }

    public void setDateOfPayroll(Date dateOfPayroll) {
        this.dateOfPayroll = dateOfPayroll;
    }

    public int getIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(int isProcessed) {
        this.isProcessed = isProcessed;
    }

    public int getIsFlagged() {
        return isFlagged;
    }

    public void setIsFlagged(int isFlagged) {
        this.isFlagged = isFlagged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payroll)) return false;
        Payroll payroll = (Payroll) o;
        return payrollId == payroll.payrollId &&
                isProcessed == payroll.isProcessed &&
                isFlagged == payroll.isFlagged &&
                Objects.equals(dateOfPayroll, payroll.dateOfPayroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payrollId, dateOfPayroll, isProcessed, isFlagged);
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", dateOfPayroll=" + dateOfPayroll +
                ", isProcessed=" + isProcessed +
                ", isFlagged=" + isFlagged +
                '}';
    }

}
