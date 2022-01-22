package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "expense")
public class expense {
    @Id
    @GeneratedValue
    @Column(name = "expense_id" )
    private long expense_id ;
    @ManyToOne
    @JoinColumn(name = "employee_id", table = "employee")
    @Column(name = "employee_id")
    private  long employee_id;
    @Column(name = "day_of_expense")
    private LocalDateTime day_of_expense;
    @Column(name = "description")
    private String description;
    @Column(name = "expenseAmount")
    private float expenseAmount;

    public long getExpense_id() {
        return expense_id;
    }

    public void setExpense_id(long expense_id) {
        this.expense_id = expense_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public LocalDateTime getDay_of_expense() {
        return day_of_expense;
    }

    public void setDay_of_expense(LocalDateTime day_of_expense) {
        this.day_of_expense = day_of_expense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(float expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public expense(long expense_id, long employee_id, LocalDateTime day_of_expense, String description, float expenseAmount) {
        this.expense_id = expense_id;
        this.employee_id = employee_id;
        this.day_of_expense = day_of_expense;
        this.description = description;
        this.expenseAmount = expenseAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof expense)) return false;
        expense expense = (expense) o;
        return getExpense_id() == expense.getExpense_id() && getEmployee_id() == expense.getEmployee_id() && Float.compare(expense.getExpenseAmount(), getExpenseAmount()) == 0 && Objects.equals(getDay_of_expense(), expense.getDay_of_expense()) && Objects.equals(getDescription(), expense.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExpense_id(), getEmployee_id(), getDay_of_expense(), getDescription(), getExpenseAmount());
    }

    @Override
    public String toString() {
        return "expense{" +
                "expense_id=" + expense_id +
                ", employee_id=" + employee_id +
                ", day_of_expense=" + day_of_expense +
                ", description='" + description + '\'' +
                ", expenseAmount=" + expenseAmount +
                '}';
    }
}
