package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employee_id" )
    private long employeeId ;

    @ManyToMany
    @JoinTable(name = "EID_ETID",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_type_id"))
    private Set<Employee_type> roles = new HashSet<>();

    @Column(name = "first_name" )
    private String firstName;

    @Column(name = "last_name" )
    private String lastName;

    @Column(name = "address" )
    private String address;

    @Column(name = "city" )
    private String  city;

    @Column(name = "email_address" )
    private String emailAddress;

    @Column(name = "employee_start_date" )
    private LocalDateTime employeeStartDate;

    @Column(name = "employee_end_date" )
    private LocalDateTime employeeEndDate;

    @Column(name = "hourly_wage" )
    private float hourlyWage;

    @Column(name = "monthly_salary" )
    private float monthlySalary;

    @Column(name = "is_admin" )
    private long isAdmin;

    @Column(name = "is_bookeeper" )
    private long isBookeeper;

    @Column(name = "institution_id" )
    private long institutionId;

    @Column(name = "bank_account_number" )
    private long bankAccountNumber;

    @Column(name = "transit_id" )
    private long  transitId;
}
