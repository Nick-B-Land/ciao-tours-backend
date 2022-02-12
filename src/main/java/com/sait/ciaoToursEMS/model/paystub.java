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
    private long paystubId;

    @Column(name = "first_name")
    private  String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "email_address")
    private  String emailAddress;

    @Column(name = "description")
    private String description;

    @Column(name = "hourly_wage")
    private float hourlyWage;

    @Column(name = "number_of_workdays")
    private int numberOfWorkdays;

    @Column(name = "number_of_days_off")
    private int numberOfDaysOff;

    @Column(name = "non_salary_income")
    private float  nonSalaryIncome;

    @Column(name = "expense_amount")
    private float expenseAmount;

    @Column(name = "number_of_hours")
    private int numberOfHours;

    @Column(name = "monthly_salary")
    private float monthlySalary;

    @Column(name = "rate")
    private float rate;

    @Column(name = "date_of_paystub")
    private Date dateOfPaystub;

}
