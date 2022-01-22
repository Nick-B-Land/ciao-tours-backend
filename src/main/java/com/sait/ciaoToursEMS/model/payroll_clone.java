package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "payroll_clone")
public class payroll_clone {


        @Id
        @GeneratedValue
        @Column(name = "payroll_id")
        private long payroll_id;
        @ManyToOne
        @JoinColumn(name = "employee_id", table = "employee")
        @Column(name = "employee_id")
        private long employee_id;
        @Column(name = "number_of_workdays")
        private int number_of_workdays ;
        @Column(name = "number_of_days_off")
        private int number_of_days_off;
        @Column(name = "non_salary_income")
        private float non_salary_income;
        @Column(name = "expenseAmount")
        private  float expenseAmount;
        @Column(name = "numberOfHours")
        private  int numberOfHours;
        @Column(name = "monthly_salary")
        private  float monthly_salary;
        @Column(name = "date_of_payroll_creation")
        private Date date_of_payroll_creation;

        public payroll_clone(long payroll_id, long employee_id, int number_of_workdays, int number_of_days_off, float non_salary_income,
                       float expenseAmount, int numberOfHours, float monthly_salary, Date date_of_payroll_creation) {
            this.payroll_id = payroll_id;
            this.employee_id = employee_id;
            this.number_of_workdays = number_of_workdays;
            this.number_of_days_off = number_of_days_off;
            this.non_salary_income = non_salary_income;
            this.expenseAmount = expenseAmount;
            this.numberOfHours = numberOfHours;
            this.monthly_salary = monthly_salary;
            this.date_of_payroll_creation = date_of_payroll_creation;
        }

        public long getPayroll_id() {
            return payroll_id;
        }

        public void setPayroll_id(long payroll_id) {
            this.payroll_id = payroll_id;
        }

        public long getEmployee_id() {
            return employee_id;
        }

        public void setEmployee_id(long employee_id) {
            this.employee_id = employee_id;
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

        public Date getDate_of_payroll_creation() {
            return date_of_payroll_creation;
        }

        public void setDate_of_payroll_creation(Date date_of_payroll_creation) {
            this.date_of_payroll_creation = date_of_payroll_creation;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof com.sait.ciaoToursEMS.model.payroll)) return false;
            com.sait.ciaoToursEMS.model.payroll payroll = (com.sait.ciaoToursEMS.model.payroll) o;
            return getPayroll_id() == payroll.getPayroll_id() && getEmployee_id() == payroll.getEmployee_id() &&
                    getNumber_of_workdays() == payroll.getNumber_of_workdays() && getNumber_of_days_off() ==
                    payroll.getNumber_of_days_off() && Float.compare(payroll.getNon_salary_income(), getNon_salary_income()) == 0
                    && Float.compare(payroll.getExpenseAmount(), getExpenseAmount()) == 0 && getNumberOfHours() ==
                    payroll.getNumberOfHours() && Float.compare(payroll.getMonthly_salary(), getMonthly_salary()) == 0 &&
                    getDate_of_payroll_creation().equals(payroll.getDate_of_payroll_creation());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getPayroll_id(), getEmployee_id(), getNumber_of_workdays(), getNumber_of_days_off(),
                    getNon_salary_income(), getExpenseAmount(), getNumberOfHours(), getMonthly_salary(),
                    getDate_of_payroll_creation());
        }

        @Override
        public String toString() {
            return "payroll{" +
                    "payroll_id=" + payroll_id +
                    ", employee_id=" + employee_id +
                    ", number_of_workdays=" + number_of_workdays +
                    ", number_of_days_off=" + number_of_days_off +
                    ", non_salary_income=" + non_salary_income +
                    ", expenseAmount=" + expenseAmount +
                    ", numberOfHours=" + numberOfHours +
                    ", monthly_salary=" + monthly_salary +
                    ", date_of_payroll_creation=" + date_of_payroll_creation +
                    '}';
        }
    }

