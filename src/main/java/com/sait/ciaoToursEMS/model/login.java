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

    public login(){}

    public login(long loginId, Employee employee, String password) {
        this.loginId = loginId;
        this.employee = employee;
        this.password = password;
    }

    public long getLoginId() {
        return loginId;
    }

    public void setLoginId(long loginId) {
        this.loginId = loginId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof login)) return false;
        login login = (login) o;
        return getLoginId() == login.getLoginId() && Objects.equals(getEmployee(), login.getEmployee()) && Objects.equals(getPassword(), login.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLoginId(), getEmployee(), getPassword());
    }

    @Override
    public String toString() {
        return "login{" +
                "loginId=" + loginId +
                ", employee=" + employee +
                ", password='" + password + '\'' +
                '}';
    }
}
