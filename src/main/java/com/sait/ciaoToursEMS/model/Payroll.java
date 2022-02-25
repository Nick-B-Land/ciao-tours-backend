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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "date_of_payroll")
    private  Date dateOfPayroll  ;

    public Payroll(){}

    public Payroll(long payrollId, Employee employee, Date dateOfPayroll) {
        this.payrollId = payrollId;
        this.employee = employee;
        this.dateOfPayroll = dateOfPayroll;
    }

    public long getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(long payrollId) {
        this.payrollId = payrollId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        return getPayrollId() == payroll.getPayrollId() && Objects.equals(getEmployee(), payroll.getEmployee()) && Objects.equals(getDateOfPayroll(), payroll.getDateOfPayroll());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPayrollId(), getEmployee(), getDateOfPayroll());
    }

    @Override
    public String toString() {
        return "payroll{" +
                "payrollId=" + payrollId +
                ", employee=" + employee +
                ", dateOfPayroll=" + dateOfPayroll +
                '}';
    }
}
