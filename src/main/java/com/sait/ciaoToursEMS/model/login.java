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
    private long login_id;
    @ManyToOne
    @JoinColumn(name = "employee_id", table = "employee")
    @Column(name = "employee_id")
    private long employee_id;
    @Column(name = "password")
    private String password;

    public login(long login_id, long employee_id, String password) {
        this.login_id = login_id;
        this.employee_id = employee_id;
        this.password = password;
    }

    public long getLogin_id() {
        return login_id;
    }

    public void setLogin_id(long login_id) {
        this.login_id = login_id;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
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
        return getLogin_id() == login.getLogin_id() && getEmployee_id() == login.getEmployee_id() && Objects.equals(getPassword(), login.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin_id(), getEmployee_id(), getPassword());
    }

    @Override
    public String toString() {
        return "login{" +
                "login_id=" + login_id +
                ", employee_id=" + employee_id +
                ", password='" + password + '\'' +
                '}';
    }
}
