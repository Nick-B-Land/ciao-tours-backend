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
    private long employee_id ;
    @ManyToMany
    @JoinTable(name = "EID_ETID",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_type_id"))
    private Set<Employee_type> roles = new HashSet<>();
    @Column(name = "firstName" )
    private String firstName;
    @Column(name = "lastName" )
    private String lastName;
    @Column(name = "address" )
    private String address;
    @Column(name = "city" )
    private String  city;
    @Column(name = "emailAddress" )
    private String emailAddress;
    @Column(name = "employee_start_date" )
    private LocalDateTime employee_start_date;
    @Column(name = "employee_end_date" )
    private LocalDateTime employee_end_date;
    @Column(name = "hourlyWage" )
    private float hourlyWage;
    @Column(name = "Monthly_salary" )
    private float Monthly_salary;
    @Column(name = "isAdmin" )
    private long isAdmin;
    @Column(name = "isBookeeper" )
    private long isBookeeper;
    @Column(name = "institution_id" )
    private long institution_id;
    @Column(name = "bankAccount_number" )
    private long bankAccount_number;
    @Column(name = "transit_id" )
    private long  transit_id;
}
