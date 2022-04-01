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

    private long employeeIDtoFind;

    @Column(name = "date_of_payroll")
    private Date dateOfPayroll;

    @Column(name = "is_processed")
    private int isProcessed;

    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Payroll(){}

    public Payroll(long employeeIDtoFind, Date dateOfPayroll) {
        this.employeeIDtoFind = employeeIDtoFind;
        this.dateOfPayroll = dateOfPayroll;
        this.isProcessed = 0;
    }

    public Payroll(long payrollId, long employeeId, Date dateOfPayroll, int isProcessed) {
        this.payrollId = payrollId;

        this.dateOfPayroll = dateOfPayroll;
        this.isProcessed = isProcessed;
    }

    public long getEmployeeIDtoFind() {
        return employeeIDtoFind;
    }

    public void setEmployeeIDtoFind(long employeeIDtoFind) {
        this.employeeIDtoFind = employeeIDtoFind;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payroll)) return false;
        Payroll payroll = (Payroll) o;
        return payrollId == payroll.payrollId &&
                isProcessed == payroll.isProcessed &&
                Objects.equals(dateOfPayroll, payroll.dateOfPayroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payrollId, dateOfPayroll);
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", dateOfPayroll=" + dateOfPayroll +
                '}';
    }
}
