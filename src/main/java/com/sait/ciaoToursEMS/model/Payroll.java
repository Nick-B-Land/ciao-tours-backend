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

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employee_id")
    @Column(name = "employee_id")
    private long employeeId;

    @Column(name = "date_of_payroll")
    private Date dateOfPayroll;

    public Payroll(){}

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payroll)) return false;
        Payroll payroll = (Payroll) o;
        return payrollId == payroll.payrollId &&
                employeeId == payroll.employeeId &&
                Objects.equals(dateOfPayroll, payroll.dateOfPayroll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payrollId, employeeId, dateOfPayroll);
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + payrollId +
                ", employeeId=" + employeeId +
                ", dateOfPayroll=" + dateOfPayroll +
                '}';
    }
}
