package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "payroll_data")
public class payroll_data {


    @Id
    @GeneratedValue
    @Column(name = "payroll_data_id")
    private long PayrollDataId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payroll_id")
    private payroll payroll;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name = "date_of_payroll_data")
    private  Date dateOfPayrollData;

    @Column(name = "no_of_working_hours")
    private   int noOfWorkingHours;

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


}

