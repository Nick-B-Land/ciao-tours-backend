package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "payroll")
public class payroll{

    @Id
    @GeneratedValue
    @Column(name = "payroll_id")
    private long payrollId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "date_of_payroll")
    private  Date dateOfPayroll  ;

}
