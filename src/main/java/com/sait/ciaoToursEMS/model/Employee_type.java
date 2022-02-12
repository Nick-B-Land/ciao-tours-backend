package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Employee_type")
public class Employee_type {
    @Id
    @GeneratedValue
    @Column(name = "employee_type_id")
    private long employeeTypeId;

    @Column(name = "description")
    private String description;


}
