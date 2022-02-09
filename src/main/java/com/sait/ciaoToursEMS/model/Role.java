package com.sait.ciaoToursEMS.model;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;

    @Enumerated(EnumType.STRING)
    @Column
    private EnumRoles name;

    public Role() {}

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public EnumRoles getRole_name() {
        return name;
    }

    public void setRole_name(EnumRoles role_name) {
        this.name = role_name;
    }
}
