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
        private long Payroll_data_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payroll_id")
    private payroll payroll;
    @ManyToMany
    @JoinTable(name = "payroll_data_event",
            joinColumns = @JoinColumn(name = "Payroll_data_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
    private Set<Event> roles = new HashSet<>();
    @Column(name = "date_of_payroll_data")
    private  Date date_of_payroll_data;
    @Column(name = "no_of_working_hours")
    private   int no_of_working_hours;
    @Column(name = "time_off")
    private  double time_off;
    @Column(name = "office_usage")
    private  String office_usage;
    @Column(name = "other_usage")
    private  String other_usage;
    @Column(name = "usage_cost")
    private float usage_cost;
    @Column(name = "Daily_assistance_Client")
    private  String Daily_assistance_Client;
    @Column(name = "Daily_assistance_startDate")
    private LocalDateTime Daily_assistance_startDate;
    @Column(name = "Daily_assistance_endDate")
    private LocalDateTime  Daily_assistance_endDate;
    @Column(name = "daily_Assistance_fee")
    private float daily_Assistance_fee ;
    @Column(name = "Tour_booking_adminDescription")
    private String Tour_booking_adminDescription;
    @Column(name = "Tour_booking_numOfHours")
    private int Tour_booking_numOfHours;
    @Column(name = "Tour_booking_client")
    private String Tour_booking_client;
    @Column(name = "Tour_booking_adminFee")
    private float Tour_booking_adminFee ;
    @Column(name = "day_of_expense")
    private Date day_of_expense ;
    @Column(name = "Expense_description")
    private String Expense_description ;
    @Column(name = "Expense_Amount")
    private float Expense_Amount;
    @Column(name = "Expense_date")
    private Date Expense_date;
    }

