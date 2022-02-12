package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "login")
public class login{

    @Id
    @GeneratedValue
    @Column(name = "login_id")
    private long loginId;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "password")
    private String password;


}
